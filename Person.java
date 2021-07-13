public class Person {
    public static void main(String[] args) {
        // constructor call
        Person ob = new Person("Hassan");
        // encapsulation
        System.out.println(ob.getName());
        ob.setName("Hassan Butt");
        System.out.println(ob.getName());
        // inheritence
        Person student =  new Student("Danish", 254733);
        System.out.println(student.getName());
        // polymorphism
        student.run();
    }
    public Person(){
    }
    public Person(String name){
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }
    public void run(){
        System.out.println("Running Person");
    }


}



class Student extends Person{
    private int roll_number;

    public int getRoll_number() {
        return roll_number;
    }

    public void setRoll_number(int roll_number) {
        this.roll_number = roll_number;
    }

    public Student(){

    }
    public Student(String name, int roll_number){
        super(name);
        this.roll_number = roll_number;
    }

    public void run(){
        System.out.println("Running Student");
    }
}