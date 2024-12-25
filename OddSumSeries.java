import java.util.Scanner;
public class OddSumSeries {
    public static int CalOddSumSeries(int N){
        int Sum=0,i=1;
        while(i<=N){
            if(i%2!=0){
                Sum+=i;
            }
            i++;
        }
        return Sum;
    }
    public static void main(String[] args) {
        int N,Sum;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Nth series till you want : ");
        N=sc.nextInt();
        Sum=CalOddSumSeries(N);
        System.out.println("The sum of odd  series is : "+Sum);
        sc.close();
    }
    
}
