public class swap {
    public static void main(String[] args) {
        int a=0,b=24;
        System.out.println("A java program to swap two numbers without using third variable");
        System.out.println("Before swap : "+a+ "," +b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swap : "+a+ "," +b);


    }
}
