import java.util.Scanner;

class Rectangle {
    int length;
    int breadth;
    void getData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        length = sc.nextInt();

        System.out.print("Enter breadth: ");
        breadth = sc.nextInt();
    }

    void calculateArea() {
        int area = length * breadth;
        System.out.println("Area of Rectangle = " + area);
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.getData();
        r.calculateArea();
    }
}
