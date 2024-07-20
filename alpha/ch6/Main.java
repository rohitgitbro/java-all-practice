class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    void animalSound() {
        super.sound(); // Calls the sound() method of the superclass (Animal)
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound(); // Output: Dog barks
        dog.animalSound(); // Output: Animal makes a sound
    }
}
