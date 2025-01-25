## SQUARE 
````java[]

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   Scanner in = new Scanner(System.in);
	   int n = in.nextInt();

	    
	    for (int i=1;i<=n;i++){
	    
	      for (int j=1;j<=n;j++){
	          System.out.print(" * ");
	      }
	      System.out.println();
	    }
	    
		
	}
}
````
## HOLLOW SQUARE
````java[]

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   Scanner in = new Scanner(System.in);
	   int n = in.nextInt();

	    
	    for (int i=1;i<=n;i++){
	    
	      for (int j=1;j<=n;j++){
	          if(i==1 || i==n || j==1 ||j==n) {
	              System.out.print("* ");
	               }
	               else{
	                  System.out.print("  "); 
	               }
	      }
	               System.out.println();
	       
	    }
	}
}
````
## RECTANGLE
```` java[]

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   Scanner in = new Scanner(System.in);
	   int n = in.nextInt();
	   int m= in.nextInt();
	   

	    
	    for (int i=1;i<=n;i++){
	    
	      for (int j=1;j<=m;j++){
	          if(i==1 || i==n || j==1 ||j==n) {
	              System.out.print("* ");
	               }
	               else{
	                  System.out.print("     "); 
	               }
	      }
	               System.out.println();
	       
	    }
	}
}
````
## TRIANGLE
````java[]

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   Scanner in = new Scanner(System.in);
	   int n = in.nextInt();

	    
	    for (int i=1;i<=n;i++){
	        for (int sp= 1;sp<=n-i;sp++){
	            System.out.print(" ");
	        }   
	    
	      for (int j=1;j<=2*i-1;j++){
	          System.out.print("*");
	      }
	      System.out.println();
	    }
	    
		
	}
}
````

## INVERTED TRIANGLE
````java[]

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   Scanner in = new Scanner(System.in);
	   int n = in.nextInt();

	    
	    for (int i=n;i>=1;i--){
	        for (int sp= 1;sp<=n-i;sp++){
	            System.out.print(" ");
	        }   
	    
	      for (int j=1;j<=(2*i)-1;j++){
	          System.out.print("*");
	      }
	      System.out.println();
	    }
	    
		
	}
}
````

## RIGHT ANGLED TRIANGLE
```` java[]

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   Scanner in = new Scanner(System.in);
	   int n = in.nextInt();

	    
	    for (int i=1;i<=n;i++){
	    
	      for (int j=1;j<=i;j++){
	          System.out.print(" * ");
	      }
	      System.out.println();
	    }
	    
		
	}
}
````
## INVERTED RIGHT ANGLED TRIANGLE
```` java[]

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   Scanner in = new Scanner(System.in);
	   int n = in.nextInt();

	    
	    for (int i=n;i>=1;i--){
	    
	      for (int j=1;j<=i;j++){
	          System.out.print("* ");
	      }
	      System.out.println();
	    }
	    
		
	}
}
````

## MIRROR RIGHT ANGLED TRIANGLE
```` java[]

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   Scanner in = new Scanner(System.in);
	   int n = in.nextInt();

	    
	    for (int i=1;i<=n;i++){
	        for(int sp=1;sp<=n-i;sp++){
	            System.out.print("  ");
	        }
	         
	      for (int j=1;j<=i;j++){
	           System.out.print("* ");
	    }
	     System.out.println();
		
	}
}
}
````

## INVERTED RIGHT ANGLED TRIANGLE
````java[]

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   Scanner in = new Scanner(System.in);
	   int n = in.nextInt();

	    
	    for (int i=n;i>=1;i--){
	        for(int sp=1;sp<=n-i;sp++){
	            System.out.print("  ");
	        }
	         
	      for (int j=1;j<=i;j++){
	           System.out.print("* ");
	    }
	     System.out.println();
		
	}
}
}
````
## HOLLOW TRIANGLE
````java[]

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   Scanner in = new Scanner(System.in);
	   int n = in.nextInt();

	    
	    for (int i=1;i<=n;i++){
	        for (int sp= 1; sp<=n-i; sp++){
	            System.out.print("  ");
	        }   
	    
	      for (int j=1; j <= (2*i)-1; j++){
	          if (i==1 ||i== n || j==1 || j==(2*i)-1){
	              System.out.print("* ");
	          }
	          else{
	          System.out.print("  ");
	          }
	      }
	      System.out.println();
	    }
	    
		
	}
}
````

## DIAMOND 
````java[]

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   Scanner in = new Scanner(System.in);
	   int n = in.nextInt();

	    
	    for (int i=1;i<=n;i++){
	        for (int sp= 1;sp<=n-i;sp++){
	            System.out.print(" ");
	        }   
	    
	      for (int j=1;j<=2*i-1;j++){
	          System.out.print("*");
	      }
	      System.out.println();
	    }
	    for (int i=n-1;i>=1;i--){
	        for(int sp=1;sp<=n-i;sp++){
	            System.out.print(" ");
	        }
	         
	      for (int j=1;j<=2*i-1;j++){
	           System.out.print("*");
	    }
	     System.out.println();
		
	}

		
	}
}
````
## HOLLOW DIAMOND
````java[]
import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); 

        
        for (int i = 1; i <= n; i++) {
            for (int sp = 1; sp <= n - i; sp++) {
                System.out.print(" "); 
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("*"); 
                } else {
                    System.out.print(" "); 
                }
            }
            System.out.println();
        }

        
        for (int i = n - 1; i >= 1; i--) {
            for (int sp = 1; sp <= n - i; sp++) {
                System.out.print(" "); 
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" "); 
                }
            }
            System.out.println();
        }
    }
}
````

## FLOYD'S TRIANGLE
````java[]

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   Scanner in = new Scanner(System.in);
	   int n = 5;
	   int k=1;

	    
	    for (int i=1;i<=n;i++){
	    
	      for (int j=1;j<=i;j++){
	          System.out.print(k+ " ");
	          k++;
	      }
	      System.out.println();
	    }
	    
		
	}
}
````

## LEFT ARROW
````java[]

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   Scanner in = new Scanner(System.in);
	   int n = in.nextInt();

	    
	    for (int i=1;i<=n;i++){
	        for(int sp=1;sp<=n-i;sp++){
	            System.out.print("  ");
	        }
	         
	      for (int j=1;j<=i;j++){
	           System.out.print("* ");
	    }
	     System.out.println();
		
	}
	for (int i=n-1;i>=1;i--){
	        for(int sp=1;sp<=n-i;sp++){
	            System.out.print("  ");
	        }
	         
	      for (int j=1;j<=i;j++){
	           System.out.print("* ");
	    }
	     System.out.println();
		
	}

}
}
````

## RIGHT ARROW

````java[]

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   Scanner in = new Scanner(System.in);
	   int n = in.nextInt();

	    
	    for (int i=1;i<=n;i++){
	    
	      for (int j=1;j<=i;j++){
	          System.out.print(" * ");
	      }
	      System.out.println();
	    }
	    for (int i=n-1;i>=1;i--){
	        for(int sp=1;sp<=1;sp++){
	            System.out.print(" ");
	        }
	         
	      for (int j=1;j<=i;j++){
	           System.out.print("*  ");
	    }
	     System.out.println();
		
	}

		
	}
}
````

## PASCAL'S TRIANGLE

````java[]

import java.util.*;
public class Main{
    public static void main(String[]args){
       Scanner in= new Scanner(System.in);
       int n=in.nextInt();
       for (int i=1;i<=n;i++){
           int val=1;
           for (int j=1;j<=i;j++){
               System.out.print (val+ " ");
               val=val*(i-j)/j;          
      
            }
            System.out.println();
       
       
        }
    }
}
````







