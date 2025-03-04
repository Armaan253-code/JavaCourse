import java.util.*;
public class AreaOfTriangle {
    public static void main(String args[]){
        Scanner kb= new Scanner(System.in);
        double base,height,area;
        System.err.print("Enter base: ");
        base=kb.nextDouble();
        System.out.print("Enter height: ");
        height=kb.nextDouble();
        area=0.5f*base*height;
        System.out.println("Area of triangle is"+area);

    }
    
}


