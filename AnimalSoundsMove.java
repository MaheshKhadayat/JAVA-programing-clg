class Animal {
    int Age;
    String Name;

    // Constructor to initialize name and age
    Animal(String Name, int Age) {
        this.Name = Name;
        this.Age = Age;
    }

    void Sound() {
        System.out.println("Animal makes a sound");
    }

    void Move() {
        System.out.println("The animal moves");
    }
}

class Dog extends Animal {
    Dog(String Name, int Age) {
        super(Name, Age);
    }

    @Override
    void Sound() {
        System.out.println(Name + " (Age: " + Age + ") says: Baw baw baw");
    }

    @Override
    void Move() {
        System.out.println(Name + " is walking on the road.");
    }
}

class Birds extends Animal {
    Birds(String Name, int Age) {
        super(Name, Age);
    }

    @Override
    void Sound() {
        System.out.println(Name + " (Age: " + Age + ") says: Chirp Chirp");
    }

    @Override
    void Move() {
        System.out.println(Name + " is flying in the sky.");
    }
}

class Cat extends Animal {
    Cat(String Name, int Age) {
        super(Name, Age);
    }

    @Override
    void Sound() {
        System.out.println(Name + " (Age: " + Age + ") says: Meow Meow");
    }

    @Override
    void Move() {
        System.out.println(Name + " is hunting for fish.");
    }
}

public class AnimalSoundsMove {
    public static void main(String[] args) {
        Dog d = new Dog("Shiro", 23);
        d.Sound();
        d.Move();

        Birds b = new Birds("Pigeon", 2);
        b.Sound();
        b.Move();

        Cat c = new Cat("Mj", 5);
        c.Sound();
        c.Move();
    }
}
