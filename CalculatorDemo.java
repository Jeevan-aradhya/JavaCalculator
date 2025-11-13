import java.util.Scanner;

public class CalculatorDemo {

    private static int addition(int x,int y){
        return x+y;
    }

    private static int substraction(int x, int y) {
        return x-y;
    }

    private static int multiplication(int x, int y) {
        return x*y;
    }

    private static int division(int x, int y) {
        return x/y;
    }

    private static int modulus(int x, int y) {
        return x%y;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any two  numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Select the operation you need to perform 1.Addition 2.Substraction 3.Multiplication 4.Division 5.Modulus ");
        int choise=sc.nextInt();
        switch (choise){
            case 1: int sum= addition(a,b);
                System.out.println("Sum of two numbers is : "+sum);
                break;
            case 2: int sub=substraction(a,b);
                System.out.println("Substraction of two numbers is : "+sub);
                break;
            case 3: int mul=multiplication(a,b);
                System.out.println("Multiplication of two numbers is : "+mul);
                break;
            case 4: int div=division(a,b);
                System.out.println("Division of two numbers is : "+div);
                break;
            case 5: int mod=modulus(a,b);
                System.out.println("Modulus of two numbers is : "+mod);
                break;

            default:
                System.out.println("Please enter the valid choise !!!");
        }
    }
}
