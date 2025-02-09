public class Count {
    static int Data = 0; // Static variable (Shared among all objects)

    Count() {
        Data++; // Increments Data for every new object
    }

    void display() {
        System.out.println(Data + " ");
    }

    public static void main(String[] args) {
        Count obj1 = new Count(); // Data becomes 1
        obj1.display(); // Prints: 1

        Count obj2 = new Count(); // Data becomes 2
        obj2.display(); // Prints: 2
    }
}
