/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:
 *     - Uses indexOf to find strings
 *     - Handles responding to simple words and phrases
 * This version uses a nested if to handle default responses.
 *
 * Code adapted from work by Laurie White for the College Board.
 *
 * @author Trisha Ganesh
 * @version 6/19/2021
 */
public class Magpie2
{
    public String getGreeting()
    {
        return "Hello, let's talk.";
    }

    public String getResponse(String statement) {
        String response = "";

        String teacherName = "finkelstein";

        // make sure statement has atleast one character
        if (statement.trim().length() == 0) {
            response = "Please say something";
        }
        // when the statement contains the teacher name above
        else if (findKeyword(statement, teacherName, 0) >= 0) {
            int pos = findKeyword(statement, teacherName, 0);
            String statementBefore = statement.substring(0, pos);
            if (statementBefore.endsWith("mr "))
                response = "He is a good teacher.";
            else if (statementBefore.endsWith("ms "))
                response = "She is a good teacher.";
            else
                response = "Please enter Mr or Ms with teacher name";
        }
        //when the statement contains the word "cat"
        else if (findKeyword(statement, "cat", 0) >= 0) {
            response = "Tell me more about your pets.";
        }
        //when the statement contains the word "dog"
        else if (findKeyword(statement, "dog", 0) >= 0) {
            response = "Tell me more about your pets.";
        } else if (findKeyword(statement, "no", 0) >= 0) {
            response = "Why so negative?";
        } else if ((findKeyword(statement, "mother", 0) >= 0)
            || (findKeyword(statement, "father", 0) >= 0)
             || (findKeyword(statement, "sister", 0) >= 0)
            || (findKeyword(statement, "father", 0) >= 0))
            {
                response = "Please tell me more about your family.";
            }
        else{
                response = getRandomResponse();
            }
            return response;
        }

    private String getRandomResponse()
    {
        final int NUMBER_OF_RESPONSES = 6;
        double r = Math.random();
        int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
        String response = "";

        if (whichResponse == 0)
        {
            response = "Interesting, tell me more.";
        }
        else if (whichResponse == 1)
        {
            response = "Hmmm.";
        }
        else if (whichResponse == 2)
        {
            response = "Do you really think so?";
        }
        else if (whichResponse == 3)
        {
            response = "You don't say.";
        }
        else if (whichResponse == 4)
        {
            response = "That is wonderful";
        }
        else if (whichResponse == 5)
        {
            response = "Very fascinating!";
        }

        return response;
    }

    private int findKeyword(String statement, String goal, int startPos)
    {
        String phrase = statement.trim();
        // The only change to incorporate the startPos is in the line below
        int position = phrase.toLowerCase().indexOf(goal.toLowerCase(), startPos);

        // Refinement--make sure the goal isn't part of a word
        while (position >= 0)
        {
            // Find the string of length 1 before and after the word
            String before = " ", after = " ";
            if (position > 0)
            {
                before = phrase.substring(position - 1, position).toLowerCase();
            }
            if (position + goal.length() < phrase.length())
            {
                after = phrase.substring(
                        position + goal.length(),
                        position + goal.length() + 1)
                        .toLowerCase();
            }

            // If before and after aren't letters, we've found the goal word
            if (((before.compareTo("a") < 0) || (before.compareTo("z") > 0)) // before is not a letter
                    && ((after.compareTo("a") < 0) || (after.compareTo("z") > 0)))
            {
                return position;
            }

            // The last position didn't work, so let's find
            // the next, if there is one.
            position = phrase.indexOf(goal.toLowerCase(), position + 1);
        }

        return -1;
    }

    private int findKeyword(String statement, String goal)
    {
        return findKeyword(statement, goal, 0);
    }

}
