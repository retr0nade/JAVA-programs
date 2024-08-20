import java.util.*;

public class hello {

    String status;
    String name;
    hello(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.println("Hello "+name);
    }

    hello(String s){
        
        System.out.print("Enter status: ");
        Scanner sc1 = new Scanner(System.in);
        s = sc1.nextLine();
        status = s;
        if(s.equals("Taken")){
            System.out.println("Stay Loyal");
        }
        else if(s.equals("Single")){
            System.out.println("Go visit a Dating site");
        }
    }
    

    public static void main(String[] args){
        
        hello ob = new hello();
        hello ob1 = new hello(ob.status);
}
    
}
