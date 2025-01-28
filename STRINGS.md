## DEVELOP A LOGIN SYSTEM AND NEED TO VALIDATE THE USER CREDENTIALS:

~~~~ java[]

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        
        System.out.print("Enter the username: ");
        String user = in.nextLine();

        System.out.print("Enter the password: ");
        String password = in.nextLine();


        if (user.equals(password)) {
            System.out.println("logged in successfully!");
        } else {
            System.out.println("Incorrect passwotrd.");
        }
    }
}

~~~~

##   IN AN TEXT EDITOR APPLICATION FIND AND REPLACE THE  WORDS IN THE TEXT

~~~~ java[]

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    String str1 = " text editor";
	    
		System.out.println(str1.replace("t","T") );
	}
}
~~~~










       

