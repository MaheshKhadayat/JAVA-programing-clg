public class BinarySearch {
    public static int BinSearch(int Arr[],int Tar){
        int Mid,End=Arr.length-1,Beg=0;
        while(End>=Beg){
            Mid=Beg+(End-Beg)/2;
            if(Arr[Mid]==Tar){
                return Mid;
            }else if(Arr[Mid]>Tar){
                End=Mid-1;
            }else{
                Beg=Mid+1;
            }
          }
          return -1;
    }
    public static void main(String[] args) {
        int Arr[]={1,2,3,4,5,6,7,9,10};
        int Tar=10;
        int Found=BinSearch(Arr,Tar);
        if(Found!=-1){
            System.out.println("The element is found at the location  "+ Found);
        }else{
            System.out.println("The element is not there in the list");
        }
    }
}
