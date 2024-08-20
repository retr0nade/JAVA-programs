import java.util.*;

public class q4 {

    public static void main(String[] args){

        System.out.print("ENTER A NUMBER: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num > 0){
            System.out.println("Number is Positive");
        }
        else if(num < 0){
            System.out.println("Number is Negative");
        }
        else{
            System.out.println("Number is 0");
        }

        sc.close();
            
    }
    
}
