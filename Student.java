public class Student {
    int r;
    String name;
    void getdata(){
        r=1;
        name="ABC";

    }
    void dsiplay(){
        System.out.println(r);
        System.out.println(name);
    }
    public static void main(String[] args) {
        Student S1 = new Student();
        S1.getdata();
        S1.dsiplay();

    }
}

    

