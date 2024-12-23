public class Pyramid {
    public static void main(String[] args) {
        int N=4;
        for(int i=0;i<N;i++){
            for(int j=i;j<N-1;j++){
                System.out.print("  ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(j+1 + " ");
            }
            for(int j=i;j>0;j--){
                if(i>0){
                System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}
