import java.util.Scanner;


public class Project1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean loggedIn = usernameAndPassword(input);
        if (loggedIn == true) {
            double q1Grade= 80.0;
            System.out.print("Enter the students name: ");
            String name = input.nextLine();
            System.out.print("Enter the students age: ");
            int age = input.nextInt();
            System.out.print("Enter the students number of absences: ");
            int numOfAbsences = input.nextInt();
            System.out.print("Enter the students tardies: ");
            int numOfTardies = input.nextInt();
            System.out.print("Enter the students AP exam score: ");
            int apExamScore = input.nextInt();
            input.nextLine();

            double q2grade = assignments(input);
            System.out.print("enter in the grade of the semester exam: ");
            int semesterExamGrade = input.nextInt();
            double totalGrade = (q1Grade * 0.40 ) + (q2grade * 0.40) + (semesterExamGrade * 0.20);
            System.out.println("The students total grade is " + totalGrade);
            
            if (q2grade >= 70) {
                
                if (haveToTakeSemesterExam(numOfAbsences, numOfTardies) == true) {
                    System.out.println("The student has to take the semester exam");
                    System.out.println("enter in the grade of the semester exam");
                    
                } else {
                    System.out.println("The student does not have to take the semester exam");
                }
                if (q2grade >= 80 && apExamScore >= 4) {
                    System.out.println("The student has passed the class with honors with the grade of " + q2grade);
                } else {
                    System.out.println("The student has passed the class with the grade of " + q2grade);
                }
            } else {
                System.out.println("The student has failed the class");
                
            }
        }
        input.close();
    }

    public static boolean usernameAndPassword(Scanner input) {
            System.out.print("username: ");
            String username = input.nextLine();
            System.out.print("password: ");
            String password = input.nextLine();
            if (username.equals("simpsonL".trim()) && password.equals("PiDay314".trim())) {
                System.out.println("Welcome, " + username);
                return true;
            } else {
                System.out.println("Invalid username or password");
                return false;  
            }
            
        }
       
        public static double assignments(Scanner input) {
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
            return q2Grade;
        }

        public static boolean haveToTakeSemesterExam(int numOfAbsences, int numOfTardies) {
            if (numOfAbsences >= 5 || numOfTardies >= 10 ) {
                return true;
            } else {
                return false;
            }
        }
    }
