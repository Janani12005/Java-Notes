````java[]

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Count digits
        int count = 0;
        number = Math.abs(number);  // Handle negative numbers
        
        if (number == 0) {
            count = 1;
        } else {
            while (number != 0) {
                number = number / 10;
                count++;
            }
        }
        
        System.out.println("Number of digits: " + count);
    }
}
````
