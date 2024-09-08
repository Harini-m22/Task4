package task4;
import java.util.Stack;

public class IntegerStack {
    // Create a stack to store integers
    private Stack<Integer> stack;

    // Constructor to initialize the stack
    public IntegerStack() {
        stack = new Stack<>();
    }

    // Method to push an element onto the stack
    public void pushElement(int element) {
        stack.push(element);
        System.out.println("Pushed: " + element);
    }

    // Method to pop an element from the stack
    public int popElement() {
        if (!stack.isEmpty()) {
            int poppedElement = stack.pop();
            System.out.println("Popped: " + poppedElement);
            return poppedElement;
        } else {
            System.out.println("Stack is empty, cannot pop");
            return -1; // Return -1 if stack is empty
        }
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        // Create an instance of IntegerStack
        IntegerStack integerStack = new IntegerStack();

        // Push elements onto the stack
        integerStack.pushElement(10);
        integerStack.pushElement(20);
        integerStack.pushElement(30);

        // Pop elements from the stack
        integerStack.popElement();
        integerStack.popElement();

        // Check if the stack is empty
        System.out.println("Is stack empty? " + integerStack.isEmpty());

        // Pop last element
        integerStack.popElement();

        // Check again if stack is empty
        System.out.println("Is stack empty? " + integerStack.isEmpty());
    }
}

//OUTPUT
//Pushed: 10
//Pushed: 20
//Pushed: 30
//Popped: 30
//Popped: 20
//Is stack empty? false
//Popped: 10
//Is stack empty? true