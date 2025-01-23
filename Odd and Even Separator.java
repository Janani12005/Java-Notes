import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
	    Scanner s=new Scanner(System.in);
	    int n = s.nextInt();
	    for(int i=1; i<n ;i++)
	    {
	        if(i%2==0)
	            System.out.print(i+ " ");
	   }
	   System.out.println();
	   for(int i=1; i<n ;i++)
	    {
	        if(i%2!=0)
	            System.out.print(i+ " ");
	}
	
}
}
