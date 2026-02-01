public class Sum {
    public static void main(String[] args) {
        int num = 123;

        int sum = (num % 10) + (num / 10) % 10 + (num / 100);

        System.out.println("Sum = " + sum);
    }
}
