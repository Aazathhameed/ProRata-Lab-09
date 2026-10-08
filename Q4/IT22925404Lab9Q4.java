import java.util.Scanner;

public class IT22925404Lab9Q4 {

    public static double calcFinalMark(double assignmentMark, double examPaperMark) {
        double finalMark = (assignmentMark * 0.3) + (examPaperMark * 0.7);
        return finalMark;
    }

    public static char findGrades(double finalMark) {
        char grade;
        if (finalMark >= 75) {
            grade = 'A'; 
        } else if (finalMark >= 60) {
            grade = 'B'; 
        } else if (finalMark >= 50) {
            grade = 'C'; 
        } else {
            grade = 'F'; 
        }
        return grade;
    }

    public static void printDetails(String name, double finalMark, char grade) {
        System.out.println(name + "\t\t" + finalMark + "\t\t" + grade);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] names = new String[5];
        double[] assignMarks = new double[5];
        double[] examMarks = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Name of Student " + (i + 1) + ": ");
            names[i] = scanner.next();
            
            System.out.print("Enter Assignment Mark (out of 100) for " + names[i] + ": ");
            assignMarks[i] = scanner.nextDouble();
            
            System.out.print("Enter Exam Paper Mark (out of 100) for " + names[i] + ": ");
            examMarks[i] = scanner.nextDouble();
            
            System.out.println(); 
        }

        System.out.println("Name\t\tFinal Mark\tGrade");
        
        for (int i = 0; i < 5; i++) {
            double finalMark = calcFinalMark(assignMarks[i], examMarks[i]);
            char grade = findGrades(finalMark);
            printDetails(names[i], finalMark, grade);
        }
        
        scanner.close();
    }
}