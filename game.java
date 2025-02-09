public class game {
    int Score;
    static int TopScore=0;
    void Score1(int Score){
        this.Score=Score;
        if(Score>TopScore){
            TopScore=Score;
        }
    }
    void display(){
        System.out.println("Player Score : "+Score);
    System.out.println("Top Score : "+TopScore);
    }
    public static void main(String[] args) {
        game obj=new game();
        game obj1=new game();
        game obj2=new game();

    obj.Score1(100);
    obj2.Score1(200);
    obj1.Score1(300);
    obj1.display();


    }

   
}
