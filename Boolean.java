import java.util.Scanner;

public class Boolean {
    public static void main(String args[]) {
        Scanner S = new Scanner(System.in);

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = S.nextBoolean();

        if (isStudent) {
            System.out.println("You are a student.");
        } else {
            System.out.println("You are not a student.");
        }
    }
}
