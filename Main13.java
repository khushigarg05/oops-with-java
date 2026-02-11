class Parent{
    void display(){
        System.out.println("I am in display() of parent class");
    }
}
class Child extends Parent{
    void show(){
        System.out.println("I am in show() of Child class");
    }
}



public class Main13 {
    public static void main(String[] args) {
        Parent P = new Parent();
        P.display();
        Child C= new Child();
        C.show();
        C.display();
    }
    
}
