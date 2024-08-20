import java.util.Scanner;

public class ifelse {

    public static void main(String[] args){

        System.out.println("ENTER AGE: ");
        Scanner sc = new Scanner(System.in);
        int age;
        age = sc.nextInt();

        if(age > 18){
            System.out.println("The person is mature enough");
        }

        else{
            System.out.println("The person is still underage");
        }

        sc.close();

    }

}
