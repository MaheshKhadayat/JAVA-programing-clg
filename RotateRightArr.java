public class RotateRightArr {
    public static void main(String[] args) {
       int Arr[]={1,2,3,4,5};
       int last=Arr[Arr.length-1]; 
       System.out.println("Array before right rotate : ");
       for(int i=0;i<Arr.length;i++){
        System.out.print(Arr[i]+" ");
    }
       for(int i=Arr.length-1;i>0;i--){
        Arr[i]=Arr[i-1];
       }
       Arr[0]=last;
        System.out.println("\nRotated array elements : ");
        for(int i=0;i<Arr.length;i++){
            System.out.print(Arr[i]+" ");
        }
    }
}
