//Brute force Approach to find the pair sum in an array
public class PairSum2 {
    public static void FindPairSum(int A[],int Target){
        for(int i=0;i<A.length;i++){
            for(int j=i+1;j<A.length;j++){
            if(A[i]+A[j]==Target){
                System.out.println("The pair of  sum :  "+i +"  "+j);
            }
        }
        }
        
    }
    public static void main(String[] args) {
        int Arr[]={1,3,4,5,5,6,7},Tar=13;
        FindPairSum(Arr,Tar);
    }
}
