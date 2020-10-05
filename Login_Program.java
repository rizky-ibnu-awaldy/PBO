import java.util.*;
public class Login_Program {
    public static void main (String[] args){
        // Login Program
        String u,p;
        Scanner inputUser= new Scanner(System.in);
        System.out.print("Insert Username: ");
        u = inputUser.next();
        System.out.print("Insert Password: ");
        p = inputUser.next();
        while(!u.equals ("rizky") && !p.equals("ibnu")){
            System.out.print("Wrong Username or Password :(\n");
            System.out.print("Insert Username: ");
            u = inputUser.next();
            System.out.print("Insert Password: ");
            p = inputUser.next();
        }
        System.out.println("Welcome, sir :) ");
    }
}
