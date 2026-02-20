
class Parent {

    Parent() {
        System.out.println("Parent class default constructor called");
    }
}

class Child extends Parent {
    Child() {
        System.out.println("Child class constructor called");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Child obj = new Child();
    }
}
