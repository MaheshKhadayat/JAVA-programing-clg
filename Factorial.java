import java.util.Scanner;
public class Factorial {
    public static int factorial (int N) {
        int Fact=1;
        if(N<0){
            System.out.println("Invalid number");
            return -1;
        }
        for(int i=1;i<=N;i++){
            Fact=Fact*i;
        }
        return Fact;
    
    }
    public static void main(String[] args) {
        int N,Result;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number : ");
        N=sc.nextInt();
        Result=factorial(N);
        if(Result!=-1){
        System.out.println("The  factorial of  a  given number is "+ Result);
        }
        sc.close();     
}
}
