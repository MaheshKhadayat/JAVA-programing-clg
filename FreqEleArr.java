public class FreqEleArr {
    public static void main(String[] args) {
        int Freq;
        int A[]={1,2,1,2,3,4};
        for(int i=0;i<A.length;i++){
            if(A[i]==-1){
                continue;
            }
            Freq=1;
            for(int j=i+1;j<A.length;j++){
                if(A[i]==A[j]){
                    Freq++;
                    A[j]=-1;//Tracks the duplicate elements 
                }
            }
            System.out.println("The frequency of  "+A[i]+"  ="+Freq);
        }

    }
    
}
