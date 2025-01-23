## STRONG NUMBER
````java[]

import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
	  Scanner in = new Scanner(System.in);
	  int n = in.nextInt();
	  int r,s=0;
	  int temp=n;
	  while(n>0)
	  {
	    r=n%10;
	    int fact=1;
	    for(int i=1; i<=r; i++)
	    {
	        fact=fact*i;
	    }
        s=s+fact;
        n=n/10;
	  }    
        if(s==temp)
        {
            System.out.println("Strong Number");
        }
	    else{
	        System.out.println("not an strong number");
	    }
	    
	  }
	}	  
````

## AUTOMORPHIC NUMBER
````java[]

import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
	  Scanner in = new Scanner(System.in);
	  System.out.println("enter n :");
	  int n = in.nextInt();
	  int sq=n*n;
	  while(n>0)
	  {
	    if(n%10 != sq%10)
        {
            System.out.println(" not an Automorphic number");
            break;
        }
    n=n/10;
    sq=sq/10;
	    
	    }
	    if(n==0){
	    System.out.println("  Automorphic number");    
	    }
	  }
	}
````
## ADAM NUMBERr
````java[]
import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
	  Scanner in = new Scanner(System.in);
	  int n = in.nextInt();
	  int sq=n*n;
	  System.out.println(" sq: " +sq);
	  int s=0;
	  while(sq>0)
	  {
	    int r = sq%10;
	    s=s*10+r;
	    sq/=10;
	  }
	  System.out.println(" rev :" + s);
	  int sqrt = (int)Math.sqrt(s);
	  System.out.println("sqrt :" + sqrt);
	  int s1=0;
	  while(sqrt>0){
	      int r=sqrt%10;
	      s1=s1*10 + r;
	      sqrt/=10;
	  }
	  System.out.println("rev : "+ s1);
	  if(s1==n){
	      System.out.println(" it is an adam number");
	  }
	   else{
	       System.out.println(" not an adam number");
	}
}
}
````
## HARSHAD NUMBER
```` java[]
import java.util.Scanner;

public class HarshadNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int num = in.nextInt();

        
        int sumOfDigits = 0;
        int temp = num; // 
        while (temp > 0) {
            sumOfDigits += temp % 10; 
            temp /= 10;              
        }

        
        if (num % sumOfDigits == 0) {
            System.out.println(num + " is a Harshad Number.");
        } else {
            System.out.println(num + " is NOT a Harshad Number.");
        }
    }
}
````

