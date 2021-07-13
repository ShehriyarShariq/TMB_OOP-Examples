public class Animal {
    public static void main(String args[]) {
        Dog animal1 = new Dog();
        Cat animal2 = new Cat();
        Duck animal3 = new Duck();

        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal duck = new Duck();

        animal1.Bark();
        animal2.Meow();
        animal3.Quack();
        System.out.println("Polymorphism:");
        dog.Greet();
        cat.Greet();
        duck.Greet();
        System.out.println("Inheritance:");

        animal1.Greet();
        animal2.Greet();
        animal3.Greet();

    }

    public void Greet() {
        System.out.println("Hello!! I am an animal");
    }

}

class Dog extends Animal {

    public void Bark() {
        System.out.println("Bark");
    }

    public void sayHello() {
        System.out.println("Hello!! I am a dog");
    }
}

class Cat extends Animal {
    public void Meow() {
        System.out.println("Meow");
    }

    public void sayHello() {
        System.out.println("Hello!! I am a cat");
    }
}

class Duck extends Animal {
    public void Quack() {
        System.out.println("Quack");
    }

    public void sayHello() {
        System.out.println("Hello!! I am a duck");
    }
}
