import java .util.Scanner;
public class Main {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.println("Enter marks obtained in each subject (out of 100):");
        int numSubjects = 0;
        int totalMarks = 0;
        while (true) {
            System.out.print("Subject " + (numSubjects + 1) + " marks: ");
            int marks = scanner.nextInt();
            if (marks < 0 || marks > 100) {
                System.out.println("Marks should be between 0 and 100. Please try again.");
                continue;
            }
            totalMarks += marks;
            numSubjects++;
            System.out.print("Do you have more subjects? (yes/no): ");
            String moreSubjects = scanner.next().toLowerCase();
             if (moreSubjects.equals("no")) {
                break;
            }
        }
        double averagePercentage = (double) totalMarks / numSubjects;
        System.out.print("Average Percentage of the student is "+averagePercentage);
        System.out.print("\n");
        if(averagePercentage>=90){
            System.out.println("grade A");
        }
        else if(averagePercentage>=80){
            System.out.println("grade B");
        }
        else if(averagePercentage>=70){
            System.out.println("grade C");
        }
        else if (averagePercentage>=60){
            System.out.println("grade D");
        }
        else if(averagePercentage>=50){
            System.out.println("grade E");
        }
        else if(averagePercentage>=40){
            System.out.println("grade is Poor");
        }
        else{
            System.out.println("Fail");
        }

    }
}
