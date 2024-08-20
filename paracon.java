public class paracon {

    int year;
    
    paracon(){
        System.out.print("The year is ");
    }

    paracon(int y){
        year = y;
        System.out.print(year);
    }

    public static void main(String[] args){
        paracon ob = new paracon();
        paracon ob1 = new paracon(2077);
    }
    
}
