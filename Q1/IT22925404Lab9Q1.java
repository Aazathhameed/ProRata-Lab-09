import java.util.Scanner;

public class IT22925404Lab9Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Enter value b: ");
        double b = scanner.nextDouble();
        
        System.out.print("Enter value c: ");
        double c = scanner.nextDouble();

        double discriminant = Math.pow(b, 2) - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            
            System.out.println("\nRoots are real and different :");
            System.out.printf("Root 1: %.2f\n", root1);
            System.out.printf("Root 2: %.2f\n", root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("\nRoots are real and same :");
            System.out.printf("Root 1: %.2f\n", root);
            System.out.printf("Root 2: %.2f\n", root);
        } else {
            System.out.println("\nRoots are complex and different");
        }

        scanner.close();
    }
}