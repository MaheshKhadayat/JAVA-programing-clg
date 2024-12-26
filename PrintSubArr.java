public class PrintSubArr {
    public static void main(String[] args) {
        int A[]={1,2,3,4};
        for(int i=0;i<A.length;i++){
            int st=i;
            int end=A.length-1;
            for(int j=st;j<=end;j++){
                System.out.print(A[j]+" ");
            }
            System.out.println();
            st++;
            end--;
        }
    }
}
