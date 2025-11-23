public class Car extends RoadVehicle implements ImportDuty
{
    private double price;

    public Car(int wheels, int passengers, double price)
    {
        super(wheels, passengers);
        this.price = price;
    }

    public double calculateDuty()
    {
        return price * CARTAXRATE;
    }

    public String toString()
    {
        return super.toString() + ", Type: Car, Price: " + price;
    }
}