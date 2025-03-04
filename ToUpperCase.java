import java.util.*;

public class ToUpperCase {
    public static void main(String args[]){
        Scanner kb = new Scanner(System.in);
        char ch,cap;
        System.err.print("Enter small case alphabets: ");
        ch=kb.next().charAt(0);
        cap=(char)(ch-32);
        System.out.println("Capital alphabets is :"+cap);

    }
    
}
