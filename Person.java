public class Person {
    String Name;
    Person(String Name){
        this.Name=Name;
    }
    void display(){
        System.out.println("Name : "+Name);
    }
    void display(int Age){
        System.out.println("Name : "+Name+"\nAge : "+Age);
    }
    public static void main(String[] args) {
            Person P=new Person("Mahesh");
            P.display();
            P.display(5);
    }
}
