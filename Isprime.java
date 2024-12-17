import java.util.Scanner;

public class Isprime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Num,i;
        System.out.println("Enter a Number : ");
        Num=sc.nextInt();
        if(Num<2){
            System.out.println(Num+" 33is not a prime number");
            return;
        }
        for(i=2;i<Math.sqrt(Num);i++){
            if(Num%2==0){
               System.out.println(Num+" is not a prime number");
               return;
            }
        }

        if(i>Math.sqrt(Num)){
            System.out.println(Num+" is a prime number");
        }
        sc.close();
     
    }
    
} 