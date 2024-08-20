import java.util.*;

public class cal {
    cal(int a, int b){
        System.out.println(a*b);
    }
    cal(int a, int b, int c){
        System.out.println(a*b*c);
    }
    cal(double a, double b){
        System.out.println(a*b);
    }
    
    public static void main(String[] args){
        cal c = new cal(15,20);
        cal c1 = new cal(15,20, 300);
        cal c2 = new cal(15.6d,20.67d);
    }
}
