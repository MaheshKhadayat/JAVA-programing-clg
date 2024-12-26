//Calculate the gcd using eculidean algorithm
import java.util.Scanner;
public class GCD {
    public static int gcd(int A,int B){
        while(B!=0){
            int Temp=B;
            B=A%B;
            A=Temp;
        }
        return A;
    }
    public static void main(String[] args) {
        int A,B,Result;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of A: ");
        A=sc.nextInt();
        System.out.println("Enter the value of B: ");
        B=sc.nextInt();
        Result=gcd(A,B);
        System.out.println("The Greatest Common Divisor of  "+A+" And "+B+" is  "+Result);   
        sc.close();
    }

}
