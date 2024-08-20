import java.util.*;

public class twodarray {

    public static void main(String[] args){
        int[][] arr = new int[10][10];

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

        //find min and max of array
        
        int max = arr[0][0];
        int min = arr[0][0];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(arr[i][j] < arr[i][j+1]){
                    max = arr[i][j+1];
                }
                if(arr[i][j] > arr[i][j+1]){
                    min = arr[i][j];
                }
            }
        }

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);

    }
    
    
}
