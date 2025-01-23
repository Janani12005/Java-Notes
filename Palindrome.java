import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
	   
	   int rem;
	   int s=0;
	   int temp=n;
	   while(n>0)
	   {
	       rem =n%10;
	       s=s*10 +rem;
	       
	   }
	   if(s==temp)
	   {
	       System.out.println( "palindrome");
	   }
	   else{
	       System.out.println( "not an palindrome");
	   }
	}
}
