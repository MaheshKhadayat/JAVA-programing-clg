//Problem:In an array we have to shift all the zero elements  in the end and nos in the right order.
public class MoveZeros {
    public static void MoveZerosToEnd(int Arr[]){
        int k=0;
        for(int i=0;i<Arr.length;i++){
            if(Arr[i]!=0){
                Arr[k]=Arr[i];
                k++;
            }
        }
        while(k<Arr.length){
            Arr[k++]=0;
        }
        for(int i=0;i<Arr.length;i++){
        System.out.print(Arr[i]+" ");
        }
        
    } 
    public static void main(String[] args) {
        int Arr[]={0,1,2,0,3,4};
        MoveZerosToEnd(Arr);
        
    }
    
}
