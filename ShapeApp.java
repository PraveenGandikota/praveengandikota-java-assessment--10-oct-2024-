import shapes.*;
import java.util.Scanner;

public class ShapeApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Choose a shape (Circle, Rectangle) or 'exit' to quit: ");
            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the program.");
                break;
            }

            if (choice.equalsIgnoreCase("Circle")) {
                System.out.print("Enter the radius: ");
                double radius = scanner.nextDouble();
                scanner.nextLine();  // Consume newline
                Circle circle = new Circle(radius);
                System.out.printf("Area: %.2f, Perimeter: %.2f%n", circle.area(), circle.perimeter());
            } else if (choice.equalsIgnoreCase("Rectangle")) {
                System.out.print("Enter height: ");
                double height = scanner.nextDouble();
                System.out.print("Enter width: ");
                double width = scanner.nextDouble();
                scanner.nextLine();  // Consume newline
                Rectangle rectangle = new Rectangle(height, width);
                System.out.printf("Area: %.2f, Perimeter: %.2f%n", rectangle.area(), rectangle.perimeter());
            } else {
                System.out.println("Invalid shape. Please try again.");
            }
        }
        scanner.close();
    }
}



