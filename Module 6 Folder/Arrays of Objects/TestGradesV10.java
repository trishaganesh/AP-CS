/**
 * @purpose: The TestGradesV10 Object Class
 *
 * @author Trisha Ganesh
 * @version FLVS 2021
 * @date 06/5/2021
 */

public class TestGradesV10 {

    //private instance variables initialized
    private String n;
    private int grade1;
    private int grade2;

    //constructor
    public TestGradesV10(String studentName, int studentQuizGrade1, int studentQuizGrade2)
    {
        n = studentName;
        grade1 = studentQuizGrade1;
        grade2 = studentQuizGrade2;
    }

    //getter and setter methods
    public String getStudentName() {
        return n;
    }

    public double getStudentQuizGrade1() {
        return grade1;
    }

    public double getStudentQuizGrade2() {
        return grade2;
    }


    public void setStudentName(String studentName) {
        n = studentName;
    }

    public void setStudentQuizGrade1(int studentQuizGrade1) {
        grade1 = studentQuizGrade1;
    }

    public void setStudentQuizGrade2(int studentQuizGrade2) {
        grade2 = studentQuizGrade2;
    }


    //calculate the sums of Grade 1 and Grade 2
    public double calcGrade1Grade2Sum1()
    {
        double Grade1Grade2Sum1 = 0.0;
        Grade1Grade2Sum1 = grade1 + grade2;
        return Grade1Grade2Sum1;
    }

    public double calcGrade1Grade2Sum2()
    {
        double Grade1Grade2Sum2 = 0.0;
        Grade1Grade2Sum2 = grade1 + grade2;
        return Grade1Grade2Sum2;
    }

    public double calcGrade1Grade2Sum3()
    {
        double Grade1Grade2Sum3 = 0.0;
        Grade1Grade2Sum3 = grade1 + grade2;
        return Grade1Grade2Sum3;
    }

    public double calcGrade1Grade2Sum4()
    {
        double Grade1Grade2Sum4 = 0.0;
        Grade1Grade2Sum4 = grade1 + grade2;
        return Grade1Grade2Sum4;
    }

    //calculate the difference of Grade 1 and Grade 2
    public double calcGrade1Grade2Difference1()
    {
        double grade1Grade2Difference1 = 0.0;
        grade1Grade2Difference1 = grade2 - grade1;
        return grade1Grade2Difference1;
    }

    public double calcGrade1Grade2Difference2()
    {
        double grade1Grade2Difference2 = 0.0;
        grade1Grade2Difference2 = grade2 - grade1;
        return grade1Grade2Difference2;
    }

    public double calcGrade1Grade2Difference3()
    {
        double grade1Grade2Difference3 = 0.0;
        grade1Grade2Difference3 = grade2 - grade1;
        return grade1Grade2Difference3;
    }

    public double calcGrade1Grade2Difference4()
    {
        double grade1Grade2Difference4 = 0.0;
        grade1Grade2Difference4 = grade2 - grade1;
        return grade1Grade2Difference4;
    }

    //calculate the average of Grade 1 and Grade 2
    public double calcGrade1Grade2Average1()
    {
        double grade1Grade2Average1 = 0.0;
        grade1Grade2Average1 = (grade2 + grade1) / 2.0;
        return grade1Grade2Average1;
    }

    public double calcGrade1Grade2Average2()
    {
        double grade1Grade2Average2 = 0.0;
        grade1Grade2Average2 = (grade2 + grade1) / 2.0;
        return grade1Grade2Average2;
    }

    public double calcGrade1Grade2Average3()
    {
        double grade1Grade2Average3 = 0.0;
        grade1Grade2Average3 = (grade2 + grade1) / 2.0;
        return grade1Grade2Average3;
    }

    public double calcGrade1Grade2Average4()
    {
        double grade1Grade2Average4 = 0.0;
        grade1Grade2Average4 = (grade2 + grade1) / 2.0;
        return grade1Grade2Average4;
    }

    //toString() method returning a String
    public String toString() {
        return String.format("%-9s %-10.1f", getStudentName(), getStudentQuizGrade1(), getStudentQuizGrade2());
    }
}
