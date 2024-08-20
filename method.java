import java.util.*;

public class method {    
    int add(int a, int b){
        return a+b;
    }
    float add(float a, float b){
        return a*b;
    }

    public static void main(String[] args){
        method m = new method();
        float mul = m.add(15.8f,20.2f);
        int sum = m.add(15,20);
        System.out.println(sum);
        System.out.println(mul);
    }
}