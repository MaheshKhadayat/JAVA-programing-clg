import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int RevNo=0,Rem,Num;
        System.out.println("Enter a Number :  ");
        Num=sc.nextInt();
        int OrignalNum=Num;
        while(Num>0){
            Rem=Num%10;
            RevNo=RevNo*10+Rem;
            Num=Num/10;
        }
        if(RevNo==OrignalNum){
            System.out.println(OrignalNum +" is a palindrome number");
        }else{
        System.out.println(OrignalNum+" is not palindrome number");
        }
        sc.close();
    }
}
