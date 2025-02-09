public class largestofthree {
    int Largest(int A,int B,int C){
        if(A>B && A>C){
            return A;
        }
        if(B>C){
            return B;
        }
        return C;
    }
    int Largest(int A,int B){
        if(A>B){
            return A;
        }
        return B;
    }
    public static void main(String[] args) {
        largestofthree obj=new largestofthree();
        

        System.out.println("The largest of two numbers : "+obj.Largest(10,20));
        System.out.println("The largest of three numbers : "+obj.Largest(10,20,30));
    }
}