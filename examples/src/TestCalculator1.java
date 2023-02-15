public class TestCalculator1 {

    public void addition(int a,int b){
        int reasult = a+b;
        System.out.println("The addition is "+ reasult);
    }

    public static void main(String[] args){

        TestCalculator1 obj = new TestCalculator1();
        obj.addition(50,60);

    }
}
