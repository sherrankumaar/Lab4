import java.util.Scanner;

class RectangleArea {
    private double length;
    private double width;
    private double area;

    public void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        length = sc.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        width = sc.nextDouble();
    }

    public void computeField() {
        area = length * width;
    }

    public void fieldDisplay() {
        System.out.println("A rectangle with length " + length +
                " and width " + width + " has an area of " + area);
    }
}

public class Task1 {
    public static void main(String[] args) {
        RectangleArea rectangle = new RectangleArea();
        rectangle.getData();
        rectangle.computeField();
        rectangle.fieldDisplay();
    }
}
