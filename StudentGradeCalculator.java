import java.util.Scanner;

import javax.swing.text.html.parser.TagElement;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get student name
        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();
        
        // Get scores for subjects
        System.out.print("Enter the score for Mathematics: ");
        double mathScore = scanner.nextDouble();
        
        System.out.print("Enter the score for Science: ");
        double scienceScore = scanner.nextDouble();
        
        System.out.print("Enter the score for English: ");
        double englishScore = scanner.nextDouble();
        
        System.out.print("Enter the score for Telugu: ");
        double Telugu = scanner.nextDouble();
        
        System.out.print("Enter the score for Physical Education: ");
        double Physics = scanner.nextDouble();
        
        // Calculate total and average scores
        double totalScore = mathScore + scienceScore + englishScore + Telugu + Physics;
        double averageScore = totalScore / 5;
        
        // Determine the grade
        char grade;
        if (averageScore >= 90) {
            grade = 'A';
        } else if (averageScore >= 80) {
            grade = 'B';
        } else if (averageScore >= 70) {
            grade = 'C';
        } else if (averageScore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        
        // Display the result
        System.out.println("\nStudent Name: " + name);
        System.out.println("Total Score: " + totalScore);
        System.out.println("Average Score: " + averageScore);
        System.out.println("Grade: " + grade);
        
        scanner.close();
    }
}
