//Two pointer approach to reverse a nn array
public class RevArrTwoPointer {
    public static void main(String[] args) {
        int Arr  []={5,4,3,2,1};
        int Beg,End,Temp;
        Beg=0;
        End=Arr.length-1;
        while(Beg<End){
            Temp=Arr[Beg];
            Arr[Beg]=Arr[End];
            Arr[End]=Temp;
            Beg++;
            End--;
        }
        System.out.println("Reversed array : ");
        for(int i=0;i<Arr.length;i++){
        System.out.print(Arr[i]+ " ");
        }
    }
}
