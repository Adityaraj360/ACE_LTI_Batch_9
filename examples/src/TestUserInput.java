import java.util.Scanner;

public class TestUserInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age ");
        String input = sc.next();

        System.out.println("Your age is "+input);
    }
}
