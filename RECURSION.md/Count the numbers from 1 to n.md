## Implementation

````java[]


import java.util.*;

public class Main {
    public static int sum(int n) {
        if (n <= 1) {   //Base case
            return n;
        }
        return n + sum(n - 1);  // recursive case
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println("sum of 6: " + sum(n));
    }
}
````
