import java.util.Scanner;

public class TestConditions {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age ");
        int age = sc.nextInt();

        System.out.println("Your age is "+age);

        if(age>=18){
            System.out.println("Yes you can cast your vote!");
        }else{
            System.out.println("No you can not cast your vote!");
        }
    }
}
