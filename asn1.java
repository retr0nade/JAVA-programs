//check whether a person is eligible to vote and not dead using default and parameterized constr

import java.util.*;

public class asn1 {
public
    int age;
    asn1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        age = sc.nextInt();
    }

    asn1(int age){
        if(age>100){
            System.out.println("DEAD");
        }
        else if(age<18){
            System.out.println("Can't vote");
        }
        else if(age>18){
            System.out.println("Eligible to vote");
        }
    }

    public static void main(String[] args){
        asn1 ob = new asn1();
        asn1 ob1 = new asn1(ob.age);
    }
}