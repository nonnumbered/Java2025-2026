import java.util.Scanner;

public class SumThing {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a number: ");
int number = scanner.nextInt();
int sum = 0;
for (int i = 0; i <= number; i++) {
    sum += i;
}
System.out.println("The sum from 0 to " + number + " is " + sum);
scanner.close();
}
}