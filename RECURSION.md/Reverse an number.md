````java[]

import java.util.Scanner;

public class Main {
    
    public static int reverse(int number, int reversed) {
        if (number == 0) { // Base case
            return reversed;
        } else {
            return reverse(number / 10, reversed * 10 + number % 10); // Recursive case
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int number = scanner.nextInt();
        int reversedNumber = reverse(number, 0);
        System.out.println("Reversed Number: " + reversedNumber);
    }
}
````
