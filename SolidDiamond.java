public class SolidDiamond {

    public static void main(String[] args) {
        int N=4;
        for(int i=1;i<=N;i++){
            for(int j=1;j<=N-i;j++){
                System.out.print("  ");

            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<=N;i++){
            for(int j=i;j>1;j--){
                System.out.print("  ");
            }
            for(int j=1;j<=2*(N-i)+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}