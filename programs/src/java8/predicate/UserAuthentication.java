package java8.predicate;

import java.util.Scanner;
import java.util.function.Predicate;

class User
{
    String username,pwd;

    User(String username,String pwd)
    {
        this.username=username;
        this.pwd=pwd;
    }

}

public class UserAuthentication
{
    public static void main(String[] args)
    {

        Predicate<User> p= u->u.username.equals("Anup")&&u.pwd.equals("Panchal");

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter user name");

        String username=sc.next();

        System.out.println("Enter pwd");
        String pwd=sc.next();


        User u=new User(username,pwd);

        if(p.test(u))
        {
            System.out.println("User is valid");
        }
        else
        {
            System.out.println("Invalid user");
        }


    }
}
