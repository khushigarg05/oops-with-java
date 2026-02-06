class MethodDemo {
    static void staticMethod1() {
        System.out.println("This is Static Method 1");
        MethodDemo obj = new MethodDemo();
        obj.normalMethod();
    }
    static void staticMethod2() {
        System.out.println("This is Static Method 2");
    }
    void normalMethod() {
        System.out.println("This is Normal Method");
        staticMethod2();
    }
    public class Main6{
        public static void main(String[] args) {
            staticMethod1();
            MethodDemo obj = new MethodDemo();
            obj.normalMethod();
    }
}
}
