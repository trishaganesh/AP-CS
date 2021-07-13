/**
 * The purpose of this program is to create an Array or ArrayList of 5 student objects with 5 grades per student.
 * We then are asked to utilize all concepts taught in this module to see how various techniques are working in Arrays
 * or ArrayLists.
 *
 * @author Trisha Ganesh
 * @version 6/25/2021
 */

import java.util.ArrayList;

public class StudentTester {

    public static void main(String[] args) {

        // create ArrayList
        ArrayList<Student> student = new ArrayList<Student>();
        student.add(new Student("Tony Starks", 89, 85, 94, 99, 98));
        student.add(new Student("Henry Pymis", 90, 94, 91, 95, 92));
        student.add(new Student("Barry Boben", 87, 89, 93, 98, 89));
        student.add(new Student("Sammy Robis", 90, 85, 94, 99, 91));
        student.add(new Student("Clara Davis", 94, 93, 94, 98, 94));


        printStudentNamesAndGrades(student);
        String nametoFind1 = "Barry Boben";
        String nametoReplace1 = "Harry Potter";
        replaceName(student, nametoFind1, nametoReplace1);
        printResults(student);

        int quizScoreReplace = 100;
        changeQuizGrade(student, nametoReplace1, 1, quizScoreReplace);
        printResults(student);

        String nameFind2 = "Clara Davis";
        String replaceName = "Sammy Robis";
        replaceStudent(student, nameFind2, replaceName);
        printResults(student);

        int insertSecondPosition = 0;
        String insertSecondStudentName = "Bruce Lanton";
        //int insertSecondStudentScores = 97;
        String existingName = "Tony Starks";
        insertStudentBeforeStudent(student, insertSecondPosition, existingName, insertSecondStudentName);
        printResults(student);

        deleteStudentPosition(student, 3);
        printResults(student);
    }
    public static void printStudentNamesAndGrades(ArrayList<Student> elements) {
        for(int index = 0; index < elements.size(); index++)
            //print statement using to String method of Student class
            System.out.println(elements.get(index));
    }

    //method for replacing a students's name
    public static void replaceName(ArrayList<Student> elements, String find, String replace) {
        for(int index = 0; index < elements.size(); index++)
            if(elements.get(index).getNameOfStudent().equals(find)) {
                System.out.println();
                System.out.print("<< Changing name from " + elements.get(index).getNameOfStudent());
                elements.get(index).setNameOfStudent(replace);
                System.out.println(" to " + elements.get(index).getNameOfStudent());
            }
    }

    public static void changeQuizGrade(ArrayList<Student> elements, String name, int find, int replace) {
        for (int index = 0; index < elements.size(); index++)
            if (elements.get(index).getNameOfStudent().equals(name)) {
                System.out.println();
                System.out.print(" << Changing grades for " + elements.get(index).getNameOfStudent());
                elements.get(index).setQuizScore(find, replace);
                System.out.println("  to " +  elements.get(index).getQuizNumber(find));
            }
    }
    public static void replaceStudent(ArrayList<Student> elements, String find, String replace) {
        for(int index = 0; index < elements.size(); index++)
            if(elements.get(index).getNameOfStudent().equals(find)) {
                System.out.println("\n");
                System.out.print("<< Changing student from " + elements.get(index).getNameOfStudent());
                elements.get(index).setNameOfStudent(replace);
                //elements.get(index).setQuizScore(changeScore);
                System.out.println(" to " + elements.get(index).getNameOfStudent() + " >>");
            }
    }

    public static void insertStudentBeforeStudent(ArrayList<Student> elements, int position, String findName, String addStudent) {
        // insert item into ArrayList

        elements.add(position, new Student(addStudent, 97, 98, 93, 94, 85));

        System.out.println();
        System.out.println("=============================================================================================");
        System.out.println("<< Before " + findName + " ," + " add " + addStudent  + " and" + " his" + " scores >>");
    }

    public static void deleteStudentPosition(ArrayList<Student> elements, int position)
    {
        elements.remove(position);
        System.out.println();
        System.out.println("=============================================================================================");
        System.out.println("<< Delete " +  "student " + position + " >>");
    }
    public static void printResults(ArrayList<Student> elements) {
        System.out.println("\n");
        System.out.println("Starting Gradebook: ");
        System.out.println();
        System.out.println("Student Name" + "\t\t\t\t" + "Q1" + "\t\t\t" + "Q2" + "\t\t\t" + "Q3" + "\t\t\t" + "Q4" + "\t\t\t" + "Q5" + "\t\t\t");
        System.out.println("=======================================================================================================================");
        for (Student student : elements) {
            int studentQuizScores1 = student.getQuizNumber(1);
            int studentQuizScores2 = student.getQuizNumber(2);
            int studentQuizScores3 = student.getQuizNumber(3);
            int studentQuizScores4 = student.getQuizNumber(4);
            int studentQuizScores5 = student.getQuizNumber(5);
            System.out.println();
            System.out.printf("%s %17s %10s %11.2s %12.4s %12.2s",
                    student.getNameOfStudent(), studentQuizScores1, studentQuizScores2, studentQuizScores3, studentQuizScores4, studentQuizScores5);
        }
    }
}
