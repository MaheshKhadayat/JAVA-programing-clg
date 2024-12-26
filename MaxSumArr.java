//Brute force approch to find the maximum of contiguos  array. 
public class MaxSumArr {
    public static int MaxArrSum(int A[]){
        int MaxSum=Integer.MIN_VALUE;
        for(int i=0;i<A.length;i++){
            int CurrSum=0;
            for(int j=i;j<A.length;j++){
                CurrSum+=A[j];
                if(CurrSum>MaxSum){   
                    MaxSum=CurrSum;
                }
            }
        }
        return MaxSum;
    }

    public static void main(String[] args) {
        int Arr[]={-1,2,3,4,-2};
        int MaxSum=MaxArrSum(Arr);
        System.out.println("The maximum of sub-array elements :  "+MaxSum);
    }
}
