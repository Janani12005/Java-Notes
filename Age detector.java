Import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	    
	    System.out.println(" enter the birth yerar");
	    int a=s.nextInt();
	    
	    System.out.println(" enter the current year");
	    int b=s.nextInt();
	    int c=(100-a)+b;
	    int d=b-a;
	    if (a>b){
	        System.out.println(c);
	    }
	    else{
	      System.out.println(d);  
	    }
		}
		
	}
