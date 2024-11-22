import java.util.Scanner;
import java.util.Stack;

public class brackets {
    public static void main(String[] args) {
        Stack<String> z = new Stack<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Code is running, enter values:");
        int y = sc.nextInt(); // Number of inputs
        sc.nextLine(); // Consume leftover newline

        // Adding elements to the stack
        for (int i = 0; i < y; i++) {
            String a = sc.nextLine();
            z.push(a); // Add each input to the stack
        }

        // Check for matching brackets
        if (z.contains("{") && z.contains("}")) {
            System.out.println("Yes");
        } else if (z.contains("[") && z.contains("]")) {
            System.out.println("Yes");
        } else if (z.contains("(") && z.contains(")")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close(); // Close the scanner
    }
}
