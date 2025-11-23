public class HGV extends RoadVehicle implements ImportDuty
{
    private double cargoValue;

    public HGV(int wheels, int passengers, double cargoValue)
    {
        super(wheels, passengers);
        this.cargoValue = cargoValue;
    }

    public double calculateDuty()
    {
        return cargoValue * HGVTAXRATE;
    }

    public String toString()
    {
        return super.toString() + ", Type: HGV, Cargo Value: " + cargoValue;
    }
}