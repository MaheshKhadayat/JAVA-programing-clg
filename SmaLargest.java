public class SmaLargest {
    public static void Largest(int Arr[]){
        int Max,Max2,Loc,Loc2;
        Max=Integer.MIN_VALUE;
        Max2=Integer.MIN_VALUE;
        Loc=-1;
        Loc2=-1;
        for(int i=0;i<Arr.length;i++){
            if(Arr[i]>Max){
                Max2=Max;
                Max=Arr[i];
                Loc2=Loc;
                Loc=i;
            }else if(Arr[i]>Max2 && Max2!=Max){
                Max2=Arr[i];
                Loc2=i;
            }
        }
        System.out.println("The maximum value in the array is "+Max+"\nIt is located at  "+Loc);
        System.out.println("The second maximum value in the array is "+Max2+"\nIt is located at  "+Loc2);
    }

    public static void Smallest(int Arr[]){
        int Min,Min2,Loc,Loc2;
        Min=Integer.MAX_VALUE;
        Min2=Integer.MAX_VALUE;
        Loc=-1;
        Loc2=-1;
        for(int i=0;i<Arr.length;i++){
            if(Arr[i]<Min){
                Min2=Min;
                Min=Arr[i];
                Loc2=Loc;
                Loc=i;
            }else if(Arr[i]<Min2 && Arr[i]!=Min){
                Min2=Arr[i];
                Loc2=i;
            }
        }
        System.out.println("The minimum value in the array is "+Min+"\nIt is located at  "+Loc);
        System.out.println("The second minimum value in the array is "+Min2+"\nIt is located at  "+Loc2);

    }
    public static void main(String[] args) {
        int Arr[]={10,5,4,2,1,4,6,7,8};
        System.out.println("The given array : ");
        for(int i=0;i<Arr.length;i++){
            System.out.print(Arr[i]+" ");
        }
        System.out.println();
        Largest(Arr);
        Smallest( Arr);
    }
}
