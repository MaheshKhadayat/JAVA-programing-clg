public class pairsum {
    public static void FindPairSum(int A[],int Target){
        for(int i=0;i<A.length;i++){
            int j=A.length-1;
            if(A[i]+A[j]==Target){
                System.out.println("The pair of  sum :  "+i +"  "+j);
            }
        }
        
    }
    public static void main(String[] args) {
        int Arr[]={1,3,4,5,5,6,7},Tar=10;
        FindPairSum(Arr,Tar);
    }
}
