public class NumberPyramid {
    public static void main(String[] args) {
        int N=6;
        for(int i=1;i<=N;i++){
            for(int j=1;j<=N-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
