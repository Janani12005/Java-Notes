##  Length

````java[]


import java.util.*;

public class Main
{
	public static void main(String[] args) {
            String str = "Hello";
	    String str2 = "World";
	    int length  = str.length();
	  System.out.println(" Print the statement :"+ length);
	}
}

````

## Character

````java[]


import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    String str = "Hello";
	    String str2 = "World";
	    char ch = str.charAt(0);
	    System.out.println(" Print the statement :"+ ch);
	}
}

````

## Boolean 

`````java[]

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    String str = "hello";
	    String str2 = "HELLO";
	    int length = str.length();
	    System.out.println(" check whether it is equal :" + str. equals(str2));
	}
}



         OR


import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    String str = "hello";
	    String str2 = "HELLO";
	    int length = str.length();
	    System.out.println(" check whether it is equal :" + str. equalsIgnoreCase(str2));
	}
}

````


## Uppercase

````java[]


import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    String str = "HELLOWORLD";
	    String str2 = "helloworld";
	    int length = str.length();
	    System.out.println( str.toUppercase());
	}
}

````


## lowercase

````java[]


import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    String str = "helloworld";
	    String str2 = "helloworld";
	    int length = str.length();
	    System.out.println(str.toLowercase());
	}
}

````


## Index()

````java[]

'
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    String str = "helloworld";
	    String str2 = "helloworld";
	    int length = str.length();
	    System.out.println("IndexOf :" + str.indexOf('R') );
	}
}


````

## last index

````java[]


import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    String str = "helloworld";
	    String str2 = "helloworld";
	    int length = str.length();
	    System.out.println("lastindexOf :" + str.lastIndexOf('R') );
	}
}

##  Startswith()

````java[]


import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    String str = "HELLO MY DEAR FRIENDS";
	    String str2 = "hello";
	    int length = str.length();
	    System.out.println("StartsWith :" + str.startswith("HELLO") );
	}
}

````

## ENDSWITH()

````java[]


import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    String str = "HELLO MY DEAR FRIENDS";
	    String str2 = "hello";
	    int length = str.length();
	    System.out.println("StartsWith :" + str.endsWith("HELLO") );
	}
}

````

## Split

````java[]


import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    String str = "HELLO MY DEAR FRIENDS";
	    String str2 = "hello";
	    int length = str.length();
	    System.out.println("Split :" + str.split("hello") );
	}
}

````

## Substring

````java[]


import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    String str = "WELCOME TO INDIA";
	    
	    int length = str.length();
	    System.out.println("substring:" + str.substring(3));
	}
}

````

## trim

````java[]

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    String str = "WELCOME TO INDIA";
	    
	    int length = str.length();
	    System.out.println("trim:" + str.trim());
	}
}

````


## replace

````java[]


import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    String str = "WELCOME TO INDIA";
	    
	    int length = str.length();
	    System.out.println("Replace:" + str.replace("W" ,"w" ));
	}
}

````

## reverse the string

````

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    String str = "WELCOME";
	    String reversed = " ";
	    for (int i = str.length()-1; i>=0 ; i--){
	        reversed += str.charAt(i);
	    }
	    System.out.println("print the values : "+ reversed);
	}
}

````


## Occurence of the character in the string

````java[]


import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    String str = "Janani";
	    char ch = 'a';
	    int count = 0;
	    for (int i = 0; i<str.length(); i++){
	        if(str.charAt(i)== ch){
	        count ++;
	        }
	    }
	    System.out.println("Occurence of the string : "+ count);
	}
}

````

## CHECK WHETHER IF THE STRING IS IN ALPHABETIC CHARACTER

````java

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    String str = "Welcome to india";
	    if(str.matches(".*[a-zA-Z]+.*")){
	        System.out.println("Having alphabetic letters");
	    }
	    else{
	        System.out.println(" Not Having alphabetic letters");
	        
	    }
	  
	}
}

````
