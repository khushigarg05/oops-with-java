import java.util.Scanner;

public class Diffinputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int a = sc.nextInt();

        System.out.print("Enter a float: ");
        float b = sc.nextFloat();

        System.out.print("Enter a double: ");
        double c = sc.nextDouble();

        System.out.print("Enter a byte: ");
        byte d = sc.nextByte();

        System.out.print("Enter a boolean (true/false): ");
        boolean e = sc.nextBoolean();

        sc.nextLine(); // clear buffer

        System.out.print("Enter a string: ");
        String name = sc.nextLine();

        System.out.println("\n--- Output ---");
        System.out.println("int = " + a);
        System.out.println("float = " + b);
        System.out.println("double = " + c);
        System.out.println("byte = " + d);
        System.out.println("boolean = " + e);
        System.out.println("string = " + name);
    }
}
