import java.nio.file.FileSystemNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("eneter your name , balance , password");
        String name=sc.next();
        double balance=sc.nextDouble();
        String password=sc.next();


        SBIUser user=new SBIUser(name,balance,password);
        System.out.println("Account created");

        //add money

        System.out.println(user.addMoney(100000));

        //withdraw money

        System.out.println("enter amount and password");
        int amount=sc.nextInt();
        String pass=sc.next();
        System.out.println(user.withdrawMoney(amount,pass));

        //rate of interset

        System.out.println(user.calculateInterest(10));

    }
}