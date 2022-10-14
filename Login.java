/*
    Lee, Sean
    
    September 19, 2021
    
    CS A257
    Project - Login (Boolean Algebra)
*/

import java.util.Scanner;

public class Login
{
    public static boolean validateLogin(String username, String password, String correctUsername, String correctPassword)
    {
        if (username.equals(correctUsername) && password.equals(correctPassword))
            return true;
        else
            return false;
    }
    
    public static boolean validateLoginDeMorgans(String username, String password, String correctUsername, String correctPassword)
    {
        if (!username.equals(correctUsername) || !password.equals(correctPassword))
            return false;
        else
            return true;
    }
    
    // below is for testing
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Create your username: ");
        String correctUsername = input.next();
        
        System.out.println("Create your password: ");
        String correctPassword = input.next();
        
        System.out.println("Use your username to sign in: ");
        String username = input.next();
        
        System.out.println("Use your password to sign in: ");
        String password = input.next();
        
        boolean validate = validateLogin(username, password, correctUsername, correctPassword);
        boolean deMorgans = validateLoginDeMorgans(username, password, correctUsername, correctPassword);
        
        if (validate == true)
            System.out.println("validateLogin function: successfully logged in.");
        else 
            System.out.println("validateLogin function: invalid username or(and) password.");
            
        if(deMorgans == true)
            System.out.println("validateLoginDeMorgans function: successfully logged in.");
        else
            System.out.println("validateLoginDeMorgans function: invalid username or(and) password.");
    }
}