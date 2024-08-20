import java.util.*;

public class q5 {

    public static void main(String[] args){

        System.out.print("Enter age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age >=0 && age <=12){
            System.out.println("CHILD");
        }
        else if(age >=13 && age <=19){
            System.out.println("TEEN");
        }
        else if(age >= 20 && age <= 59){
            System.out.println("ADULT");
        }
        else if(age >= 60){
            System.out.println("SENIOR");
        }
        else{
            System.out.println("ENTER VALID AGE");
        }

        sc.close();
    }
    
}