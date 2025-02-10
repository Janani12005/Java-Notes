## Simple progran

````jav[]

import java.util.*;
public class Main {
    
    
    public static int nthFibonacci(int n) {
        if (n <= 1) { // Base case 
            return n;
        }
        return nthFibonacci(n - 1) + nthFibonacci(n - 2); // Recursive case
    }

    public static void main(String[] args) {
        int number = 6; 
        int result = nthFibonacci(number);  
        System.out.println(result); 
    }
}
````
