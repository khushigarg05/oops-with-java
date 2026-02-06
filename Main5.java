class Student{
    int r;
    static String name="Khushi";
    void display(){
        System.out.println(r);
        System.out.println(name);
    }
    static void show(){
        //System.out.println(r);
        System.out.println(name);

    }

}


public class Main5 {
    public static void main(String[] args) {
        Student S= new Student();
        S.display();
        Student.show();
        S.show();
    }
    
}
