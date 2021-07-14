class Calculation1{
    int c;
    public void addition(int a, int b){
        c=a+b;
        System.out.println("The addition of a and b is "+c);
    }
    public void subtraction(int a, int b){
        c=a-b;
        System.out.println("The subtraction of a and b is "+c);
    }
    
}

public class Calculation2 extends Calculation1{
    public void subtraction(int a, int b){
        c=a-b;
        System.out.println("subtraction of a,b: "+c);
    }
    public void multiplication(int a, int b){
        c=a*b;
        System.out.println("The multiplication of a and b is "+c);
    }
    public void division(int a, int b){
        c=a/b;
        System.out.println("The division of a and b is "+c);
    }
    public static void main(String args[]){
        int a= 10, b= 5;
        Calculation2 s1= new Calculation2();
        s1.addition(a,b);
        s1.subtraction(a,b);
        s1.multiplication(a,b);
        s1.division(a,b);
        
    }
}