import java.util.Scanner;

public class RectangleAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Using int data type
        System.out.println("Using int data type:");
        System.out.print("Enter the length (integer): ");
        int lengthInt = scanner.nextInt();

        System.out.print("Enter the width (integer): ");
        int widthInt = scanner.nextInt();

        int areaInt = lengthInt * widthInt; // Correct calculation for int
        System.out.println("Area of the rectangle (int): " + areaInt);

        // Using float data type
        System.out.println("\nUsing float data type:");
        System.out.print("Enter the length (float): ");
        float lengthFloat = scanner.nextFloat();

        System.out.print("Enter the width (float): ");
        float widthFloat = scanner.nextFloat(); // Intentional error: Trying to read float with next()

        float areaFloat = lengthFloat * widthFloat; // This will not work as intended
        System.out.println("Area of the rectangle (float): " + areaFloat);

        scanner.close();
    }
}