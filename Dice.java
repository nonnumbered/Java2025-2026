import java.lang.Math;

public class Dice {

    public static void main(String[] args) {
        int dice1 =  (int) (Math.random() * 6) + 1;
        int dice2 =  (int) (Math.random() * 6) + 1;
        if (dice1 + dice2 >= 7) {
            System.out.println("The sum is 7 or higher");
        } else {
            System.out.println("The sum is not higher than 7");
        }
    }
}
