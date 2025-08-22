import java.util.Scanner;
public class FiveAndSeventySix {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = input.nextInt();
    if (!(num >= 5 && num <= 76)) {
        System.out.println("True");

    } else {
        System.out.println("False");
    }
    input.close(); 
}
}
