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
