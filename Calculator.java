import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner numberInput = new Scanner(System.in);
        
        // asking and repeating the name
        System.out.print("Enter your name: ");
        String name = numberInput.nextLine();
        System.out.println("Hello " + name + ", Welcome to calculator");
        
        // number input
        System.out.print("enter in number 1: ");
        int num1 = numberInput.nextInt();
        System.out.println(num1);
        System.out.print("enter in number 2: ");
        double num2 = numberInput.nextDouble();
        System.out.println(num2);
        System.out.print("enter in number 3: ");
        int num3 = numberInput.nextInt();
        System.out.println(num3);
        System.out.print("enter in number 4: ");
        double num4 = numberInput.nextDouble();
        System.out.println(num4);
        numberInput.close();

        // showing the calculation
        System.out.println("The sum of number 2 & number 3 is: " + (num2 + num3));
        System.out.println("The diffrence of number 1 & number 4 is: " + (num1 - num4));
        System.out.println("The product of number 1 & number 2 is: " + (num1 * num2));
        System.out.println("The quotient of number 3 & number 4 is: " + (num3 / num4));
        System.out.println("The remainder of the division of number 2 & number 3 is: " + (num2 % num3));

        // closing statement
        System.out.println("\tThank you " + name + ",\n\tfor using the calculator");

    }
}