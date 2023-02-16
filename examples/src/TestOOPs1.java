
//1. Inheritance
// is-A and has-A
//code reusability

class Calclator{

    int a;
    int b;

    public int addition(){
        return this.a+this.b;
    }
}

class SuperCalculator extends Calclator{

    int c;

    public void log(){
        System.out.println("Logging result.");
    }

}


public class TestOOPs1 {
    public void gradeCalculator(Student st){
        SuperCalculator supercalc = new SuperCalculator();

        supercalc.addition();
        supercalc.log();
    }
}
