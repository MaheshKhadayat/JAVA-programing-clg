public class FloydsTriangle {
        public static void main(String[] args) {
            int Num=1,N=5;
            for(int i=0;i<N;i++){
                for(int j=i;j>=0;j--){
                    System.out.print(Num++ + " ");
                }
                System.out.println();
            }
        }
        
    
    
}
