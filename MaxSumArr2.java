public class MaxSumArr2 {
    public static int MaxArrSum(int A[]){
        int CurrSum=0;
        int MaxSum=Integer.MIN_VALUE;
        for(int i=0;i<A.length;i++){
            CurrSum+=A[i];
            if (CurrSum > MaxSum) {
                MaxSum = CurrSum;
            }
            if(CurrSum<=0){
                CurrSum=0;
            }
        }
        return MaxSum;
    }
    public static void main(String[] args) {
        int Arr[]={-1,2,4,-2};
        int MaxSum=MaxArrSum(Arr);
        System.out.println("The maximum of sub-array elements :  "+MaxSum);
    }
}
