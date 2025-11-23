public class RoadVehicle
{
    private int wheels;
    private int passengers;

    public RoadVehicle(int wheels, int passengers)
    {
        this.wheels = wheels;
        this.passengers = passengers;
    }

    public String toString()
    {
        return "Wheels: " + wheels + ", Passengers: " + passengers;
    }
}