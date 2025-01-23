import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
	   
	   int count=0;
	   int num = 3456789;
	   System.out.println( "given number::" + num);
	   while (num != 0){
	      num=num/10;
	      ++count;
	       
	   }
	     System.out.println("given number::"+count);
	    
	}
}
