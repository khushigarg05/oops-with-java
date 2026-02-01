import java.util.Scanner;
class Areauser {
    public static void main(String args[]){
        Scanner S = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = S.nextDouble();

        double area = 3.14 * r * r;

        System.out.println("Area of circle = " + area);
    }
}
