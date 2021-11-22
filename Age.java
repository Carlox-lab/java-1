package age;

import java.util.Scanner;

public class Age 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type your age"); 
        int age;
        age = sc.nextInt();
     
        if (age >= 18) 
        {  
         System.out.println("You are an adult");
        }
        else 
        {
        System.out.println("You are not an adult");
        }
        System.out.println("End of the code");
    }
}
