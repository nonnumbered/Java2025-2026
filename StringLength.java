import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a string: ");
        String myStr = input.nextLine();
        if (myStr.length() < 10) {
            System.out.println("The String has a length less than 10");
        } else {
            System.out.println("The String has a length of 10 or larger");
        }
        input.close();
    }
}
