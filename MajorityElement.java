public class MajorityElement {
    public static void main(String[] args) {
        int Nums[]={1,2,3,2,1};
        for(int i=0;i<Nums.length;i++){
            int Count=1;
            for(int j=i+1;j<Nums.length;j++){
                if(Nums[i]==Nums[j]){
                    Count++;
                }
            }
        if(Count>Nums.length/2){
          System.out.println("Majority element : "+ Nums[i]);
          return;
        }
    }
    System.out.println("No majority element");

    
    }
}

