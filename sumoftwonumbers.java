import java.util.*;

public class sumoftwonumbers{
    public static void main(String args[]){
        //create three variables
        int a,b,sum;
        //create object of scanner to read values
        Scanner kb= new Scanner(System.in);
        //Prompt user for input
        System.out.print("Enter first number: ");
        //Read number from keyboard 
        a=kb.nextInt();
        System.out.print("Enter second number: ");
        b=kb.nextInt();
        sum=a+b;
        System.out.println("The sum of"+" "+a+" and"+" "+b+" is"+" "+sum);


    }
}