package task4;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentGrades {

    // HashMap to store student names and grades
    private Map<String, Integer> studentGrades;

    // Constructor
    public StudentGrades() {
        studentGrades = new HashMap<>();
    }

    // Method to add a new student
    public void addStudent(String name, int grade) {
        studentGrades.put(name, grade);
        System.out.println("Added: " + name + " with grade " + grade);
    }

    // Method to remove a student
    public void removeStudent(String name) {
        if(studentGrades.containsKey(name)) {
            studentGrades.remove(name);
            System.out.println("Removed: " + name);
        } else {
            System.out.println("Student not found.");
        }
    }

    // Method to display a student's grade
    public void displayStudentGrade(String name) {
        if(studentGrades.containsKey(name)) {
            System.out.println(name + "'s grade: " + studentGrades.get(name));
        } else {
            System.out.println("Student not found.");
        }
    }

    public static void main(String[] args) {
        StudentGrades sg = new StudentGrades();
        Scanner sc = new Scanner(System.in);

        // Adding some students for demonstration
        sg.addStudent("Alice", 85);
        sg.addStudent("Bob", 90);
        sg.addStudent("Charlie", 78);

        // Display a student's grade
        System.out.println("Enter student name to display grade:");
        String name = sc.nextLine();
        sg.displayStudentGrade(name);

        // Remove a student
        System.out.println("Enter student name to remove:");
        name = sc.nextLine();
        sg.removeStudent(name);

        sc.close();
    }
}

//Output

//Added: Alice with grade 85
//Added: Bob with grade 90
//Added: Charlie with grade 78
//Enter student name to display grade:
//Bob
//Bob's grade: 90
//Enter student name to remove:
//Charlie
//Removed: Charlie