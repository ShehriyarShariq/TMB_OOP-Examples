class JavaTest {
    public static void main(String args[]) {
        System.out.println("Hello World");
        System.out.println(myMethod(4));
        System.out.println(myMethod(5));
    }    
    
    public static int myMethod(int num) {
        return 9 - num;
    }
}