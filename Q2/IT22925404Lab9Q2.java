import java.util.Scanner;

public class IT22925404Lab9Q2 {
    
    public static double circleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        
        double area = circleArea(radius);
        
        System.out.println("Area of the circle is: " + area);
        
        scanner.close();
    }
}