import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.println("enter the input : ");
	    char ch=s.next().charAt(0);
	    
	    if((ch>='a'&& ch<='z') || (ch>='A'&& ch<='Z')){
	       System.out.println("Alphabet");
	       if((ch == 'a' || ch == 'e' ||  ch == 'i' || ch == 'o' || ch == 'u') ||( ch == 'A' || ch == 'E' || ch == 'I' ||ch == 'O' ||ch == 'U' )){
	           System.out.println("it is a vowel");
	       
	       }
	       else{
	           System.out.println("it is not an vowel");
	       }
	    }
	    else if(Character.isDigit(ch)){
	        System.out.println("number");
	    }
	    else{
	        System.out.println("symbol");
	    }
	}	
}
