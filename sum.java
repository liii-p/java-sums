import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
       System.out.println("Input two numbers. Press enter between each integer.");
       Scanner userInput = new Scanner(System.in);

       int a = userInput.nextInt();
       int b = userInput.nextInt();
       userInput.close();

       System.out.println("The sum of your integers is: " + Integer.sum(a, b));
    }
}