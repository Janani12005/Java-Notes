import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
	   Scanner s=new Scanner(System.in);
	   int n=567;
	   StringBuffer a= new StringBuffer(String.valueOf(n));
	   a.reverse();
	   n=Integer.parseInt(String.valueOf(a));
	   System.out.println(n);
	    }
	}
