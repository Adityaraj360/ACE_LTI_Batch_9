
//Method overloading - same name method with different no or type of parameters
class Calculator{
    public void addition(int a,int b){
        System.out.println(a+b);
    }

    public void addition(int a,int b,int c){
        System.out.println(a+b+c);
    }
}

public class TestOOPs5 {

    public static void main(String[] args){
        Calculator calc = new Calculator();
        calc.addition(12,35,67);
    }
}
