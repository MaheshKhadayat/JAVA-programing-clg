public class MajorityElement3 {
    public static void main(String[] args) {
       int Nums[]={1,2,1,1,-5};
       int Freq=0,Ans=0;
       for(int i=0;i<Nums.length;i++){
        if(Freq==0){
            Ans=Nums[i];
        }
        if(Ans==Nums[i]){
            Freq++;
        }else{
            Freq--;
        }
       }
       int Count=0;
       for(int i=0;i<Nums.length;i++){
        if(Nums[i]==Ans){
            Count++;
        }
       }
       if(Count>Nums.length/2){
        System.out.println("The majority element is  "+Ans);
       }else{
        System.out.println("No majority element");
       }
    }
            
    
}
