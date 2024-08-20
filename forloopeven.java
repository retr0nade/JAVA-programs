import java.util.*;

public class forloopeven {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter limit: ");
        int n = sc.nextInt();

        for(int i=0; i<=n; i+=2){
            System.out.println(i);
        }
    }
    
}
