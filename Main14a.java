class Parent1 {
    int a, b;

    void show() {
        System.out.println(a + " and " + b);
    }
}

class Child1 extends Parent1 {
    int c;

    void display() {
        System.out.println(c);
    }

    void getsum() {
        System.out.println(a + b + c);
    }
}

public class Main14a {
    public static void main(String[] args) {

        Child1 C = new Child1();
        C.a = 10;
        C.b = 20;
        C.c = 30;

        C.show();
        C.display();
        C.getsum();
    }
}
