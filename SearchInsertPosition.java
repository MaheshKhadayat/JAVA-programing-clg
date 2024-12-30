public class SearchInsertPosition {
    public static int SearchInsertPos(int Arr[],int Tar) {
        int End=Arr.length-1;
        int Beg=0;
        while(Beg<=End){
            int Mid=(Beg+End)/2;
            if(Arr[Mid]==Tar){
                return Mid;
            }else if(Arr[Mid]>Tar){
                End=Mid-1;
            }else{
                Beg=Mid+1;
            }
        }
        return Beg;
    }
public static void main(String[] args) {
    int Arr[]={1,2,4,5,6};
    System.out.println("The given array  : ");
       for(int i=0;i<Arr.length;i++){
        System.out.print(Arr[i]+" ");
    }
    int Target=7; 
    int Pos=SearchInsertPos(Arr,Target);
    System.out.println("\nThe position of the element if  inserted is  "+Pos);
   
    
}
}
