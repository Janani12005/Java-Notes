## Class and Constructors(Name & Age):

````java[]

import java.util.*;
public class Person
{
    String name;
    int age;
    Person(String name,int age){
        this.name= name;
        this.age= age;
        }
    
    void display(){
        System.out.println(name);
        System.out.println(age);
}   
	public static void main(String[] args) {
		Person p1= new Person("jaan",20);
		p1.display();
	}
}
````

## Rectangle (Area & Perimeter)

````java[]

import java.util.*;
public class Rectangle
{
    int area(int l, int w)
    {
        return l*w;
    }
    int perimeter(int l, int w)
    {
        return 2*(l+w);
    }
    public static void main(String[]args){
        Scanner i = new Scanner(System.in);
        int l=i.nextInt();
        int w=i.nextInt();
        Rectangle r = new Rectangle();
        int area= r.area(l,w);
        System.out.println("Area is : "  +area);
        int perimeter = r.perimeter(l,w);
        System.out.println("Perimeter is : " +perimeter);
        System.out.println(r.area(l,w));
        System.out.println(r.perimeter(l,w));
    }
    
}
````

## Create a class with attribute and print them:

````java[]

import java.util.*;
public class person
{
    String name;
    int age;
    
     public static void main(String[]args)
     {
         Scanner in=new Scanner(System.in);
         String name=in.nextLine();
         int age=in.nextInt();
         System.out.println("name is :" +name);
         System.out.println("age is :" +age);
         
     }     
}
````

## Odd/Even

````java[]

import java.util.*;

class Main {

    void Oddeven(int num) {
        if (num % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is not even");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        Main m = new Main();
        m.Oddeven(num); 
    }
}
````

## Simple Interest Calculation

```` java[]

import java.util.*;

class Main {
    int p;
    int n;
    int r;
      
      void calculatesSI(int p,int n,int r){
           int SI=(p*n*r)/100;
           System.out.println("Simple interest :" +SI);
      }

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Principal amount: ");
        int p = in.nextInt();
        System.out.print("Enter Time (in years): ");
        int n = in.nextInt();
        System.out.print("Enter Rate of Interest: ");
        int r = in.nextInt();
        Main m=new Main();
        m.calculatesSI(p, n, r);
         
    }
}
````
## Negation(~)

````java[]
import java.util.*;

class Main {
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int val= in.nextInt();
        System.out.print(~val);
        
    }
}
````
## Reverse number

````java[]

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   Scanner in = new Scanner(System.in);
	   System.out.print("enter the number:");
	   int num= in.nextInt();
	   int rem=0;
	   int sum=0;
	   while(num>0){
	       rem=num%10;
	       sum=(sum*10)+rem;
	       num=num/10;
	   }
	   System.out.print(sum);
	    
		
	}
}
````




