//2. Abstraction
// we achive using two way --> abstract another one is using Interface

abstract class RBI{

    public abstract String myEMI(int repo);

    public void myNormalMethod(){
        System.out.println("Hey from normal method.");
    }
}

class HDFCBank extends RBI {

    public String myEMI(int repo) {
        return "Yes This is HDFC LOAN amount";
    }
}


public class TestOOPs2 {
}
