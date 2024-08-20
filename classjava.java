import java.util.*;

class car{
    String color;
    String model;
    public
    void read(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter model: ");
        model = sc.nextLine();
        System.out.print("Enter color: ");
        color = sc.nextLine();
        sc.close();
    }
    void display(){
        System.out.println("Model: "+model);
        System.out.println("Color: "+color);
    }
}

public class classjava {
    public static void main(String[] args){
        car c = new car();
        c.read();
        c.display();
        
    }
    
}
