/**
 * @purpose: The purpose of this program is to create an array of TestGradesV10 objects to calculate the sum, difference, and average of 
 four students' 2 quiz scores.
 *
 * @author Trisha Ganesh
 * @version FLVS 2021
 * @date 06/5/2021
 */

public class TestGradesTesterV10 {

    public static void main(String[] args) {

        String studentName1 = "Aaron";
        int student1QuizGrade1 = 92;
        int student1QuizGrade2 = 88;

        String studentName2 = "Blake";
        int student2QuizGrade1 = 78;
        int student2QuizGrade2 = 85;

        String studentName3 = "Jaqueline";
        int student3QuizGrade1 = 93;
        int student3QuizGrade2 = 80;

        String studentName4 = "Denise";
        int student4QuizGrade1 = 92;
        int student4QuizGrade2 = 95;

        double grade1Grade2Average1 = 0.0;
        double grade1Grade2Difference1 = 0.0;
        double Grade1Grade2Sum1 = 0.0;
        double grade1Grade2Average2 = 0.0;
        double grade1Grade2Difference2 = 0.0;
        double Grade1Grade2Sum2 = 0.0;
        double grade1Grade2Average3 = 0.0;
        double grade1Grade2Difference3 = 0.0;
        double Grade1Grade2Sum3 = 0.0;
        double grade1Grade2Average4 = 0.0;
        double grade1Grade2Difference4 = 0.0;
        double Grade1Grade2Sum4 = 0.0;


        //data stored as an array of objects
        TestGradesV10[] studentGrades1 =
                {
                        new TestGradesV10(studentName1, student1QuizGrade1, student1QuizGrade2),
                };

        TestGradesV10[] studentGrades2 =
                {
                        new TestGradesV10(studentName2, student2QuizGrade1, student2QuizGrade2),
                };

        TestGradesV10[] studentGrades3 =
                {
                        new TestGradesV10(studentName3, student3QuizGrade1, student3QuizGrade2),
                };

        TestGradesV10[] studentGrades4 =
                {
                        new TestGradesV10(studentName4, student4QuizGrade1, student4QuizGrade2)
                };



        //printing the TestGradesV10 array of objects by implementing the toString() method
        for (TestGradesV10 results1 : studentGrades1) {
            grade1Grade2Average1 = results1.calcGrade1Grade2Average1();
            grade1Grade2Difference1 = results1.calcGrade1Grade2Difference1();
            Grade1Grade2Sum1 = results1.calcGrade1Grade2Sum1();
        }
        for (TestGradesV10 results2 : studentGrades2) {
            grade1Grade2Average2 = results2.calcGrade1Grade2Average2();
            grade1Grade2Difference2 = results2.calcGrade1Grade2Difference2();
            Grade1Grade2Sum2 = results2.calcGrade1Grade2Sum2();
        }

        for (TestGradesV10 results3 : studentGrades3) {
            grade1Grade2Average3 = results3.calcGrade1Grade2Average3();
            grade1Grade2Difference3 = results3.calcGrade1Grade2Difference3();
            Grade1Grade2Sum3 = results3.calcGrade1Grade2Sum3();
        }

        for (TestGradesV10 results4 : studentGrades4) {
            grade1Grade2Average4 = results4.calcGrade1Grade2Average4();
            grade1Grade2Difference4 = results4.calcGrade1Grade2Difference4();
            Grade1Grade2Sum4 = results4.calcGrade1Grade2Sum4();
        }



        {  //Displaying output & formatting output using printf
            System.out.println("\t\t\t\t\t\t\t\t\tTest Grades\t\t\t\t\t\t");
            System.out.println("=================================================================================");
            System.out.printf("%s %14s %14s %9s %14s %11s", "Student Name", "Quiz 1 Grade", "Quiz 2 Grade", "Sum", "Difference", "Average");

            System.out.println("\n");
            System.out.printf(studentName1 + "%15s %14s %17s %11s %11s",student1QuizGrade1,  student1QuizGrade2, Grade1Grade2Sum1, grade1Grade2Difference1,grade1Grade2Average1);
            System.out.println();
            System.out.printf(studentName2 + "%15s %14s %17s %11s %11s",student2QuizGrade1,  student2QuizGrade2, Grade1Grade2Sum2, grade1Grade2Difference2,grade1Grade2Average2);
            System.out.println();
            System.out.printf(studentName3 + "%11s %14s %17s %11s %11s",student3QuizGrade1,  student3QuizGrade2, Grade1Grade2Sum3, grade1Grade2Difference3,grade1Grade2Average3);
            System.out.println();
            System.out.printf(studentName4 + "%14s %14s %17s %11s %11s",student4QuizGrade1, student4QuizGrade2, Grade1Grade2Sum4, grade1Grade2Difference4,grade1Grade2Average4);
            System.out.println();
        }
    }
}
