// public class Main {
//     public static void main(String args[]) {
//         System.out.println("hello world");
//         System.out.println(myMethod(4));
//         System.out.println(myMethod(5));

//     }

//     public static int myMethod(int num) {
//         return 9 - num;
//     }

// }

public class Animal {
    public static void main(String args[]) {
        Dog animal1 = new Dog();
        Cat animal2 = new Cat();
        Duck animal3 = new Duck();
        animal1.Bark();
        animal2.Meow();
        animal3.Quack();

        animal1.sayHello();
        animal2.sayHello();
        animal3.sayHello();

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
