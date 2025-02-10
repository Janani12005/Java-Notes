## Arithmetic Exception


````java[]

package mini;

public class  demo{
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        try {
            int result = num1 / num2;
            System.out.println("numbers : " + result);
        } catch (ArithmeticException e) {
            System.out.println("zero division error");
        }
        System.out.println("program continues");
    }
}

````

## Vote

````java[]

package demo;
public class ss {
public static void main(String[] args) {
      int age=10;
          try {
               if(age>=18) {
                  System.out.print("Eligilbe for vote");
                 }
          else {
               System.out.print("Not Eligilbe for vote");
              }
             }
           catch(Exception e) {

			System.out.print("Error Occurred");
           }
          }
         }
````

		

		

	




