package task4;


// Custom checked exception
class InvalidVoterAgeException extends Exception {
    public InvalidVoterAgeException(String message) {
        super(message);
    }
}

public class Voter {
    private int voterId;
    private String name;
    private int age;

    // Parameterized constructor
    public Voter(int voterId, String name, int age) throws InvalidVoterAgeException {
        if (age < 18) {
            throw new InvalidVoterAgeException("invalid age for voter");
        }
        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }

    // Getters (optional)
    public int getVoterId() {
        return voterId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Main method to test the class
    public static void main(String[] args) {
        try {
            Voter voter = new Voter(101, "John Doe", 17); // Will throw exception
        } catch (InvalidVoterAgeException e) {
            System.out.println(e.getMessage()); // Output: invalid age for voter
        }

    }
}

//OUTPUT
//invalid age for voter