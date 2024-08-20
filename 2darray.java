import java.util.*;

public class 2darray {

    public static void main(String[] args){
        int arr[100][100];

        System.out.print("Enter no. of rows and columns: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        /*int r = sc.nextInt();
        int c = sc.nextInt();*/

        for(int i=0; i<n ; i++){
            for(int j=0; j<n; j++){
                System.out.print("Enter no: ");
                arr[i][j] = sc.nextInt();
        
            }
        }
    }
    
}
