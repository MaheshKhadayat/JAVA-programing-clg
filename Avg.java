import java.util.Scanner;
public class Avg {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int Num1,Num2,Num3,Num4,Sum;
        double avg;
        System.out.print("Enter four numbers : ");
        Num1=scanner.nextInt();
        Num2=scanner.nextInt();
        Num3=scanner.nextInt();
        Num4=scanner.nextInt();
        Sum=Num1+Num2+Num3+Num4;
        avg=Sum/4.0;
        System.out.println("The Sum of four numbers is "+Sum);
        System.out.println("The Average of  4 numbers is "+avg);
        scanner.close();

    }
}