class Overload {

    int add(int a, int b) {
        return (a + b);
    }

    int add(int a, int b, int c) {
        return (a + b + c);
    }

    double add(int a, double b) {
        return (a + b);
    }

    void add(int a, long b) {
        System.out.println(a);
        System.out.println(b);
    }
}

public class Main15 {
    public static void main(String[] args) {

        Overload O1 = new Overload();

        int r = O1.add(10, 20);
        System.out.println(r);

        int r2 = O1.add(10, 20, 30);
        System.out.println(r2);

        double r3 = O1.add(10, 20.5);
        System.out.println(r3);

        O1.add(10, 20L);
    }
}
