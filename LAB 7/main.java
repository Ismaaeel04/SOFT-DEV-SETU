public class main {

 
    public static void main(String[] args) {
        
        Dog buddy = new Dog("Buddy", 3, "Labrador");
        Cat tommy = new Cat("Tommy", 5, true);

        Vet drSmith = new Vet("Dr. Smith");

        System.out.println("--- Vaccinating Dog ---");
        drSmith.vaccinate(buddy);

        System.out.println("\n--- Vaccinating Cat ---");
        drSmith.vaccinate(tommy);
    }
}
    

