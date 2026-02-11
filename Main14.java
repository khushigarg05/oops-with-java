class Parent {

    void display() {
        privatemethod();
        System.out.println("I am in display() of Parent Class");
    }

    private void privatemethod() {
        System.out.println("I am in private method of parent class");
    }

    protected void protectedmethod() {
        System.out.println("I am in protected method of parent class");
    }
}

class Child extends Parent {

    void show() {
        System.out.println("I am in show() of Child class");
    }
}

public class Main14 {
    public static void main(String[] args) {

        Child C = new Child();
        C.show();             // Child's method
        C.display();          // Parent method (calls private method internally)
        C.protectedmethod();  // Allowed because protected + inheritance
    }
}
