import java.util.*;

public class SwapTwo {
    public static void main(String args[]){
        Scanner kb= new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a=kb.nextInt();
        System.out.print("Enter second number : ");
        int b=kb.nextInt();
        int c=a;
        a=b;
        b=c;
        System.out.println("After swapping\n a is"+a+"\nb is"+b);

    }
    
}
