import java.util.Scanner;

public class GPACalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        double totalGPA = 0;

        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter the grade for subject " + i + " (A, B, C, D, F): ");
            String grade = scanner.next().toUpperCase();
            double gpa = getGPA(grade);
            totalGPA += gpa;

            System.out.println("GPA for subject " + i + ": " + gpa);
        }

        double averageGPA = totalGPA / numSubjects;
        System.out.println("Average GPA: " + averageGPA);

        scanner.close();
    }

    public static double getGPA(String grade) {
        switch (grade) {
            case "A":
                return 4.0;
            case "B":
                return 3.0;
            case "C":
                return 2.0;
            case "D":
                return 1.0;
            case "F":
                return 0.0;
            default:
                System.out.println("Invalid grade. Please enter A, B, C, D, or F.");
                return 0.0;
        }
    }
}


