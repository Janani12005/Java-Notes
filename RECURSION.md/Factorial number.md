## Simple program

````java[]

mport java.util.*;
public class Main{
    public static int factorial(int n){
        if(n==0){ // base case
            return 1;
        }
        return n*factorial(n-1); //recursive case
    }
    public static void main(String[]args){
        int number = 5;
        System.out.println("Factotial of 5 :" + factorial(number));
    }
    
}
````
