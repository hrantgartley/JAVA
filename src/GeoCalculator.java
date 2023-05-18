import java.util.Scanner;

public class GeoCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        menu();
        int UserChoice = getChoice(scan);
        switch (UserChoice) {
            case 1:
                System.out.print("Enter the radius of the circle: ");
                double radius = scan.nextDouble();
                double circleArea = circleArea(radius);
                System.out.printf("The area of the circle with radius %.2f is: %.2f\n", radius, circleArea);
                break;
            case 2:
                System.out.print("Enter the length of the rectangle: ");
                double length = scan.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double width = scan.nextDouble();
                double rectangleArea = rectangleArea(length, width);
                System.out.printf("The area of the rectangle with length %.2f and width %.2f is: %.2f\n", length, width,
                        rectangleArea);
                break;
            case 3:
                System.out.print("Enter the base of the triangle: ");
                double base = scan.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height = scan.nextDouble();
                double triangleArea = triangleArea(base, height);
                System.out.printf("The area of the triangle with base %.2f and height %.2f is: %.2f\n", base, height,
                        triangleArea);
                break;
            default:
                System.out.println("Thank you for using my geometric calculator");
                System.exit(0);
        }
        scan.close();
    }
    
    static int getChoice(Scanner scan) {
        int choice = scan.nextInt();
        return choice;
    }

    static double circleArea(double radius) {
        return Math.PI * (radius * radius);
    }

    static double rectangleArea(double length, double width) {
        return length * width;
    }

    static double triangleArea(double base, double height) {
        return 0.5 * base * height;
    }
    static void menu() {
        System.out.println("Welcome to the Geometric Calculator");
        System.out.println("1. Calculate the area of a circle");
        System.out.println("2. Calculate the area of a rectangle");
        System.out.println("3. Calculate the area of a triangle");
        System.out.println("4. Exit");
    }
}
