import java.util.Scanner;
public class Sum {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int Num1,Num2,Sum;
        System.out.print("Enter two numbers : ");
        Num1=scanner.nextInt();
        Num2=scanner.nextInt();
        Sum=Num1+Num2;
        System.out.println("The Sum of two numbers is "+Sum);
        scanner.close();

    }
}