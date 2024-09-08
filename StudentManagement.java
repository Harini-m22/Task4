package task4;


// Custom Exception for Age not within range
class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

// Custom Exception for Name not valid
class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

// Student class
class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    // Constructor to initialize the student details
    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        this.rollNo = rollNo;
        setName(name); // Validate the name while setting it
        setAge(age);   // Validate the age while setting it
        this.course = course;
    }

    // Method to set age with validation
    public void setAge(int age) throws AgeNotWithinRangeException {
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age is not within the valid range (15 to 21).");
        }
        this.age = age;
    }

    // Method to set name with validation
    public void setName(String name) throws NameNotValidException {
        if (!name.matches("[a-zA-Z]+")) {
            throw new NameNotValidException("Name contains invalid characters. Only alphabets are allowed.");
        }
        this.name = name;
    }

    // Overriding toString method to display student details
    @Override
    public String toString() {
        return "Student [Roll No: " + rollNo + ", Name: " + name + ", Age: " + age + ", Course: " + course + "]";
    }
}

// Main class to test the program
public class StudentManagement {
    public static void main(String[] args) {
        try {
            // Creating a valid student object
            Student student1 = new Student(1, "Ramesh", 18, "Computer Science");
            System.out.println(student1);

            // Creating a student with invalid age
            Student student2 = new Student(2, "Suresh", 25, "Mechanical Engineering");
            System.out.println(student2);
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println(e.getMessage());
        }

        try {
            // Creating a student with invalid name
            Student student3 = new Student(3, "John123", 19, "Electrical Engineering");
            System.out.println(student3);
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println(e.getMessage());
        }
    }
}

//OUTPUT


//Student [Roll No: 1, Name: Ramesh, Age: 18, Course: Computer Science]
//Age is not within the valid range (15 to 21).
//Name contains invalid characters. Only alphabets are allowed.