
interface MyInterface1{

    static void myMethod(){

    }

    default void myDefault(){
        System.out.println("Hey from default;");
    }
}

public class TestOOPs3 implements MyInterface1{
/*
    public void myDefault(){
        System.out.println("Hello from new default");
    }
 */

    public static void main(String[] args){
        TestOOPs3 obj = new TestOOPs3();
        obj.myDefault();
    }
}
