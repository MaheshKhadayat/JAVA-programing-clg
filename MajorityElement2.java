import java.util.Arrays;

public class MajorityElement2 {
    public static void main(String[] args) {
        int Nums[]={0,0,2,2,3,3,3,3,3};
         Arrays.sort(Nums);
         int Freq=1;
         for(int i=0;i<Nums.length-1;i++){
            if (Nums[i]==Nums[i+1]){
                Freq++;
            }else{
                Freq=1;
            }
            if(Freq>Nums.length/2){
                System.out.println("The majority element : "+ Nums[i]);
                return;
            }
           
    
         }
         System.out.println("No majority element");
         
    }
}
