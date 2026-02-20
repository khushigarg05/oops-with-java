
class Animal {
    String name;
    Animal(String name) {
        this.name = name;
    }
    void displayAnimal() {
        System.out.println("Animal Name: " + name);
    }
}

class Dog extends Animal {
    int age;

    Dog(String name, int age) {
        super(name);  
        this.age = age;
    }

    void displayDog() {
        displayAnimal(); 
        System.out.println("Dog Age: " + age);
    }
}

public class Main20 {
    public static void main(String[] args) {

        Dog d = new Dog("Buddy", 3);
        d.displayDog();
    }
}
