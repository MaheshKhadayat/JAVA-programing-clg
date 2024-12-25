public class ReverseArray {
    public static void RevArr(int Arr[]){
        System.out.print("Reversed Array : ");
        for(int i=Arr.length-1;i>=0;i--){
            System.out.print(Arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int Arr[]={5,4,3,2,1};
        RevArr(Arr);
    }
    
}
