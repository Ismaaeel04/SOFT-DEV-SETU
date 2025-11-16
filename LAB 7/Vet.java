public class Vet {
    private String name;

    public Vet(String name) {
        this.name = name;
    }

    public void vaccinate(Animal animal) {
        System.out.println(name + " is vaccinating.");

        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            System.out.println("Dog has been vaccinated: " + dog.getDetails());
        } else if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            System.out.println("Cat has been vaccinated: " + cat.getDetails());
        }
    }
}