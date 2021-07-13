import java.util.Random;

/**
 * The purpose of this program is to carry on conversations with a human user.
 * This version:
 *      - Uses advanced search for keywords
 *      - Will transform statements as well as react to keywords

 * Code adapted from work by Laurie White for the College Board.
 *
 * @author Trisha Ganesh
 * @version 6/27/2021
 *
 */
 
public class Magpie4
{
    //default greeting
    public String getGreeting()
    {
        return "Hello, let's talk.";
    }

    public String getResponse(String statement)
    {
        String response = "";
        if (statement.length() == 0)
        {
            response = "Say something, please.";
        }

        else if (findKeyword(statement, "no") >= 0)
        {
            response = "Why so negative?";
        }
        else if (findKeyword(statement, "mother") >= 0
                || findKeyword(statement, "father") >= 0
                || findKeyword(statement, "sister") >= 0
                || findKeyword(statement, "brother") >= 0)
        {
            response = "Tell me more about your family.";
        }

        // Responses which require transformations
        else if (findKeyword(statement, "I want to", 0) >= 0)
        {
            response = transformIWantToStatement(statement);
        }

        else if (findKeyword(statement, "I want", 0) >= 0) {
            response = transformIWantSomethingStatement(statement);
        }

        else
        {
            // Look for a two word (you <something> me) pattern
            int position = findKeyword(statement, "you", 0);

            if (position >= 0 && findKeyword(statement, "me", position) >= 0)
            {
                response = transformYouMeStatement(statement);
            }
            else if (position >= 0 && findKeyword(statement, "you", position) >= 0)
            {
                response = transformISomethingYouStatement(statement);
            }
            else
            {
                response = getRandomResponse();
            }
        }
        return response;
    }

    private String transformISomethingYouStatement(String statement) {
        statement = statement.trim();
        String lastChar = statement.substring(statement.length() - 1);
        if (lastChar.equals(".")) {
            statement = statement.substring(0, statement.length() - 1);
        }
        int position1 = findKeyword(statement, "I", 0);
        int position2 = findKeyword (statement, "you", position1 + 1);
        String restOfStatement = statement.substring(position1 + 1, position2).trim();
        return "Why do you " + restOfStatement + " me?";
    }

    private String transformIWantSomethingStatement(String statement) {
        statement = statement.trim();
        String lastChar = statement.substring(statement.length() - 1);
        if (lastChar.equals(".")) {
            statement = statement.substring(0, statement.length() - 1);
        }
        int position = findKeyword (statement, "I want", 0);
        String restOfStatement = statement.substring(position + 6);
        return "Would you really be happy if you had " + restOfStatement + "?";
    }

    private String transformIWantToStatement(String statement)
    {
        //  Remove the final period, if there is one
        statement = statement.trim();
        String lastChar = statement.substring(statement.length() - 1);

        if (lastChar.equals("."))
        {
            statement = statement.substring(0, statement.length() - 1);
        }
        int position = findKeyword (statement, "I want to ", 0);
        String restOfStatement = statement.substring(position + 11).trim();
        return "What does it mean to " + restOfStatement + "?";
    }
    private String transformYouMeStatement(String statement)
    {
        //  Remove the final period, if there is one
        statement = statement.trim();
        String lastChar = statement.substring(statement.length() - 1);

        if (lastChar.equals("."))
        {
            statement = statement.substring(0, statement.length() - 1);
        }

        int positionOfYou = findKeyword (statement, "you", 0);
        int positionOfMe = findKeyword (statement, "me", positionOfYou + 3);

        String restOfStatement = statement.substring(positionOfYou + 3, positionOfMe).trim();
        return "What makes you think that I " + restOfStatement + " you?";
    }

    private int findKeyword(String statement, String goal, int startPos) {
        String phrase = statement.trim();
        //  The only change to incorporate the startPos is in the line below
        int position = phrase.toLowerCase().indexOf(goal.toLowerCase(), startPos);

        //  Refinement--make sure the goal isn't part of a word
        while (position >= 0)
        {
            //  Find the string of length 1 before and after the word
            String before = " ", after = " ";
            if (position > 0)
            {
                before = phrase.substring (position - 1, position).toLowerCase();
            }
            if (position + goal.length() < phrase.length())
            {
                after = phrase.substring(position + goal.length(), position + goal.length() + 1).toLowerCase();
            }

            //  If before and after aren't letters, we've found the word
            if (((before.compareTo ("a") < 0 ) || (before.compareTo("z") > 0))  //  before is not a letter
                    && ((after.compareTo ("a") < 0 ) || (after.compareTo("z") > 0)))
            {
                return position;
            }

            //  The last position didn't work, so let's find the next, if there is one.
            position = phrase.indexOf(goal.toLowerCase(), position + 1);
        }
        return -1;
    }

    private int findKeyword(String statement, String goal)
    {
        return findKeyword (statement, goal, 0);
    }

    private String getRandomResponse() {
        Random random = new Random ();
        return randomResponse [random.nextInt((randomResponse.length))];

    }
    //String Array
    private String [] randomResponse = {"Interesting, tell me more.", "Hmmm.", "Do you really think so?", "You don't say.",
            //noncommittal random responses
            "Excellent!", "Very amazing!"};
}

