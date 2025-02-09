class Animal{
    void  display(){
        System.out.println("Lets pick an  animal");
    }
}
class Dog extends Animal{
    @Override
    void display(){
    System.out.println("The animal is dog");  
    }
}
public class Inheritance {
public static void main(String[]args){
    Dog  d=new Dog();
    d.display();
}
}