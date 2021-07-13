/**
 * This class defines a Student object.
 *
 * @author Trisha Ganesh
 * @version 6/25/2021
 */

public class Student {

        private int studentScore1;
        private int studentScore2;
        private int studentScore3;
        private int studentScore4;
        private int studentScore5;
        private String studentName;

        //constructor
        //A constructor is needed to provide a way to define
        // a student object and initialize the quiz scores.
        public Student(String name, int quizScore1, int quizScore2, int quizScore3, int quizScore4, int quizScore5)
        {
            //code for constructor
            studentName = name;
            studentScore1 = quizScore1;
            studentScore2 = quizScore2;
            studentScore3 = quizScore3;
            studentScore4 = quizScore4;
            studentScore5 = quizScore5;

        }


    //a method that takes in a quiz number as input and then returns the appropriate quiz value
        public int getQuizNumber(int quizNumber)
        {
            if (quizNumber == 1)
                return studentScore1;
            else if (quizNumber == 2)
                return studentScore2;
            else if (quizNumber == 3)
                return studentScore3;
            else if (quizNumber == 4)
                return studentScore4;
            else
                return studentScore5;
        }

        //a method to get the name of a student
        public String getNameOfStudent()
        {
            return studentName;
        }

        //a method that sets a quiz score based on inputing a quiz number and new quiz score
        public void setQuizScore(int quizNumber, int quizScore) {
            if (quizNumber == 1)
                studentScore1 = quizScore;
            else if (quizNumber == 2)
                studentScore2 = quizScore;
            else if (quizNumber == 3)
                studentScore3 = quizScore;
            else if (quizNumber == 4)
                studentScore4 = quizScore;
            else
                studentScore5 = quizScore;
        }

        //a method to set the name of a student
        public void setNameOfStudent(String name) {
            studentName = name;
        }

        //toString() method which returns a String
        public String toString()
        {
            //printf to format data
            return String.format("%-9s %-9s %-9s %-9s %-9s %-9s", getNameOfStudent(), getQuizNumber(1), getQuizNumber(2), getQuizNumber(3), getQuizNumber(4), getQuizNumber(5));
        }
}

