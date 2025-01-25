## Find max and min
````java[]

public class Main
{
	public static void main(String[] args) {
	    int a[]={11,23,3,14,52};
	    for(int i=0; i<a.length; i++){
	        System.out.println(a[i] + " ");
	        
	    }
	    System.out.println();
		int max=0;
		int min=0;
		for(int i=0;i<a.length;i++){
		    if (max < a[i]){
		           max=a[i];
		}
		    if (min > a[i]){
		           min=a[i];
		    }
		    System.out.println( " the maximuum number is:"+max);
		    System.out.println( " the minimum number is: "+min);
		
	}
}
}
````

## Check the element is present or not in the given array and print Yes or Not

```` jaava[]

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        
        
        int[] array = new int[n];
        
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        
        
        System.out.print("Enter the element to search for: ");
        int element = scanner.nextInt();
        
        
        boolean found = false;
        
       
        for (int i = 0; i < n; i++) {
            if (array[i] == element) {
                found = true;
                break;  
            }
        }
        
        //
        if (found) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
}
}
````

## Array in Ascending in order

```` java[]

import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        
        int[] array = new int[n];
        
        
        System.out.print("Enter the elements in the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1-i; j++) {
                if (array[j] > array[j + 1]) {
                   
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        
        
        System.out.println("Ascending order is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
  ````

## Duplicate element

```` java[]

import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        
        int[] array = new int[n];
        
        
        System.out.print("Enter the elements in the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        
        for (int i = 0; i < n; i++) {
            for (int j =i+1; j < n; j++) {
                if (array[i] ==  array[j]) {
                   System.out.println("Duplicate is:" +array[i]);
                    
                }
            }
        }
        
        
        
        
        
    }
}
````
        
       



