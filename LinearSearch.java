public class LinearSearch {
    public static int Search(int Arr[],int Target){
        for(int i=0;i<Arr.length;i++){
            if(Target==Arr[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int Arr[]={2,3,5,6,7,1},Tar=7,Found;
        Found=Search(Arr,Tar);
        if(Found!=-1){
            System.out.println("The element is found at the location  "+ Found);
        }else{
            System.out.println("The element is not there in the list");
        }
    }
}
