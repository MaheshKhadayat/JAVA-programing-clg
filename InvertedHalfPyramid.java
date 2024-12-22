public class InvertedHalfPyramid {

    public static void main(String[] args) {
        int N=5;
       for(int i=0;i<N;i++){
           for(int j=i;j<N-1;j++){
               System.out.print("* ");
           }
           System.out.print("\n");
       }
   }
}