import java.util.Scanner;
public class sum {
    public static void main(String[] args) {

       while(true) {
           System.out.println("Welcome! Input two numbers.\n Press enter between each number.\n Note: this program rounds the answer with no decimal places.");
           Scanner userInput = new Scanner(System.in);

           double a = userInput.nextDouble();
           double b = userInput.nextDouble();

           System.out.println("Enter an operator: +, -, *, /, %");
           char op = userInput.next().charAt(0);
           double result;

           switch (op) {
               case '+':
                   result = a + b;
                   break;

               case '-':
                   result = a - b;
                   break;

               case '*':
                   result = a * b;
                   break;

               case '/':
                   result = a / b;
                   break;

               case '%':
                   result = a % b;
                   break;

               default:
                   System.out.println("Warning! Invalid operator. Try again.");

                   return;
           }
           System.out.println("Your result is " + Math.round(result));
           System.out.println("Would you like to continue? (y/n)");
           String ans = userInput.next();

           if(!ans.equals("y")) {
               break;
           }



       }
    }
}