import java.util.*;

public class multiplyofthreenumbers {

    public static void main(String args[]){
        Scanner kb= new Scanner(System.in);
        int a,b,c,d;
        System.out.println("Enter the first number : ");
        a=kb.nextInt();
        System.out.println("Enter the second number : ");
        b=kb.nextInt();
        System.out.println("Enter the third number : ");
        c=kb.nextInt();
        d=a*b*c;
        System.out.println("The multiply of three numbers is: "+d);


    }   
}
