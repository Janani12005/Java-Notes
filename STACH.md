## Push an element into the stack

````java[]

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    int size =5; 
	   
	    int top = -1;
	    int[] a = new int[size]; //array to represent the STACK
	    int [] data= {1,5,6,7,8,9,4,5,56};
	     for (int i = 0; i < data.length; i++) {
	    if (top>=size-1){
	       System.out.println("STACK IS FULL"); 
	    }
	    else{
	        top++;
	       a[top]= data[i];
	        System.out.print("Pushed " + data[i] + " to stack.");
	    }
		
	}
}
}
