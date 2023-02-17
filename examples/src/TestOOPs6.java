class Calculator1{
    public void addition(int a,int b){
        System.out.println("from parent");
        System.out.println(a+b);
    }
}

class ScientificCalculator extends Calculator1{

    public void addition(int a,int b){
        //super.addition(45,67);
        System.out.println("from chile");
        System.out.println(a+b);
    }

}

public class TestOOPs6 {

    public static void main(String[] args){
        //Calculator1 calc = new Calculator1();
        //ScientificCalculator calc = new ScientificCalculator();

        Calculator1 calc = new ScientificCalculator();
        calc.addition(12,35);
    }
}

