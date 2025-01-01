public class IsArrSorted {
    public static void main(String[] args) {
        int Arr[]={7,2,3,4,5};
        boolean Issort=true;
        for(int i=0;i<Arr.length-1;i++){
            if(Arr[i]>Arr[i+1]){
               Issort=false;
               break;
            }
        }
        if(Issort){
            System.out.println("The given array is sorted.");
        }else{
            System.out.println("The given array is not sorted.");
        }
    }
}
