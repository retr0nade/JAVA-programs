import java.util.Scanner;

public class q3 {

    public static void main(String[] args){

        System.out.print("Enter age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age < 18){
            System.out.println("Not eligible to vote");
        }
        else if(age > 18 && age < 100){
            System.out.println("Eligible to vote");
        }
        else{
            System.out.println("R.I.P.");
        }

        sc.close();
    }
    
}
