public class ReverseTriangle {
    public static void main(String[] args) {
        int N = 4;
        for (int i = 0; i<N; i++) {
            for (int j= i+1 ; j>0 ; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
