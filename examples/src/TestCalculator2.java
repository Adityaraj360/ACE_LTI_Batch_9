//OOPS:- says think as you thin in real world object, create your software

//object :- real world object
// 1 properties/attributs
// 2 functionality/behaviour

//class
//blueprint for creating objects

class Laptop{

    //claas :- common for all object
    String storeName = "RelianceDigital";

    int price;
    String cname;

    //constructor are used for initialisation, same name as of class name
    Laptop(int price,String cname){
        this.price = price;
        this.cname = cname;
    }


    public void info(){
        System.out.println("This is "+this.cname+" at price "+this.price+" available at store "+this.storeName);
    }

    public static void playMusic(){
        System.out.println("This is playing music");
    }
}


public class TestCalculator2 {

    public static void main(String[] args){
        Laptop laptop1 = new Laptop(50000,"DELL");
        laptop1.info();

        Laptop laptop2 = new Laptop(60000,"HP");
        laptop2.info();


        //laptop.playMusic();
        //Laptop.playMusic();

    }
}
