import java.util.Scanner;


public class Project1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean loggedIn = usernameAndPassword(input);
        if (loggedIn == true) {
            studentInfo(input);
            assignments(input);
        }
        input.close();
    }

    public static boolean usernameAndPassword(Scanner input) {
            System.out.print("username: ");
            String username = input.nextLine();
            System.out.print("password: ");
            String password = input.nextLine();
            if (username.equals("simpsonL") && password.equals("PiDay314")) {
                System.out.println("Welcome, " + username);
                return true;
            } else {
                System.out.println("Invalid username or password");
                return false;  
            }
            
        }
        public static void studentInfo(Scanner input) {
            System.out.print("Enter the students name: ");
            String name = input.nextLine();
            System.out.print("Enter the students age: ");
            int age = input.nextInt();
            System.out.print("Enter the students number of absences: ");
            int numOfAbsences = input.nextInt();
            System.out.print("Enter the students tardies: ");
            int numOfTardies = input.nextInt();
            System.out.print("Enter the students AP exam score: ");
            double apExamScore = input.nextDouble();
            input.nextLine();
        }
        public static void assignments(Scanner input) {
            System.out.println("enter in the grade of 2 homework assignments");
            double homework1 = input.nextDouble();
            double homework2 = input.nextDouble();
            System.out.println("enter in the grade of 2 quizzes"); 
            double quiz1 = input.nextDouble();
            double quiz2 = input.nextDouble();
            System.out.println("enter in the grade of 2 tests");
            double test1 = input.nextDouble();
            double test2 = input.nextDouble();
            
            
            double homeworkAverage = (homework1 + homework2) / 2.0;
            double homeworkWeighted = homeworkAverage * 0.60;
            double quizAverage = (quiz1 + quiz2) / 2.0;
            double quizWeighted = quizAverage * 0.30;
            double testAverage = (test1 + test2) / 2.0;
            double testWeighted = testAverage * 0.60;

            double q2Grade = homeworkWeighted + quizWeighted + testWeighted;
            System.out.println("The students grade for q2 is " + q2Grade);
        }
    }

