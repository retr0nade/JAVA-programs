public class constructor {

    String model;

    constructor(){
        model = "unknown";
        System.out.println("The model is "+model);
    }

    public static void main(String[] args){
        constructor ob = new constructor();
           
    }
}
