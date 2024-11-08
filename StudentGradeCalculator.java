import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of subjects : ");
        int NumberOfSubjects = sc.nextInt();
        int[] marks = new int[NumberOfSubjects];
        
        System.out.println("Enter the marks obtained in each subject (out of 100): ");
        for (int i = 0; i < NumberOfSubjects; i++) {
            marks[i] = sc.nextInt();
        }
        
        int sum = 0;
        for (int i = 0; i < NumberOfSubjects; i++) {
            sum += marks[i];
        }
        double percentage = (double) sum / NumberOfSubjects;
        
        char grade;
        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Total Marks: " + sum);
        System.out.println("Average Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
    }
}
