import java.util.*;
//Swapping two numbers without using third variable

public class SwapTwoNumbers {
    public static void main(String args[]){
        //Declare variables
        int a,b;
        //Create scanner object to read value
        Scanner kb = new Scanner(System.in);
        //Read value into a
        System.out.print("Enter value of a : ");
        a=kb.nextInt();
        //Read value into b
        System.out.print("Enter value of b : ");
        b=kb.nextInt();
        //Print before swapping
        System.out.println("Values before swapping\na is: "+a+"\nb is : "+ b);
        //Swap the values
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Values after swapping\na is :"+a+"\nb is : "+b);


    }
    
}
