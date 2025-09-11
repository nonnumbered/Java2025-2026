public class huh {
    public static void printFives(int num) {
        if (num < 0) {
            System.out.println("error");
            return;
        }
        for (int i = num - (num % 5); i >= 0; i -= 5) {
            System.out.print(i);
            if (i > 0) System.out.print(" ");
        }
        System.out.println();
    }
}
