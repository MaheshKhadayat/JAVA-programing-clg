import java.util.Scanner;
public class VoteAgeCriteria {
    public static void Criteria(int Age){
        if(Age>=18){
            System.out.println( "Eligible to vote");
        }else{
            System.out.println( "Not eligible to vote");
        }
        
    }
    public static void main(String[] args) {
        int Age;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your age: ");
        Age=sc.nextInt();
        Criteria (Age) ;
        sc.close();
    }
}
