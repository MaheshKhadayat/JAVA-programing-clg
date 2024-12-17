public class Fibonacci {

    public static void main(String[] args) {
        int N=10,a=0,b=1;
        System.out.println("Fibonacci Series : " +a + ", " + b);
        for(int i=2;i<N;i++){
            int next=a+b;
            System.out.println( a+" ," +b);
            a=b;
            b=next;
        }
    }
}