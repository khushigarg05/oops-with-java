
import java.util.Scanner;

class Add {
    public static void main(String args[]) {
        Scanner S = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = S.nextInt();

        System.out.print("Enter second number: ");
        int b = S.nextInt();

        int sum = a + b;

        System.out.println("Sum = " + sum);
    }
}
