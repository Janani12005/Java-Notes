import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
	  Scanner in = new Scanner(System.in);
	  int n = in.nextInt();
	  int rem;
	  int s=0;
	  while(n>0)
	   {
	       rem =n%10;
	       if(rem%2==0){
	           s=s+rem;
	       }
	       n/=10;
	   }
	   System.out.println(s);
	}
}
