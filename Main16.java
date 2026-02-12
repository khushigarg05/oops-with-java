class A{
    void methodA(){
        System.out.println("I am method() of class A");
    }
}  
class B extends A{
    void methodB(){
        System.out.println("I am in child class");
    }
}
class C extends B{
    void methodC(){
        System.out.println("I am in parent class");
    }
}
public class Main16 {
    public static void main(String[] args) {
        C C1 =new C();
        C1.methodC();
        C1.methodB();
        C1.methodA();

    }
    
}
