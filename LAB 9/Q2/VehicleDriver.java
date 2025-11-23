public class VehicleDriver
{
    public static void main(String[] args)
    {
        Car myCar = new Car(4, 5, 20000.00);
        HGV myHgv = new HGV(18, 2, 50000.00);

        System.out.println(myCar.toString());
        System.out.println("Import Duty: " + myCar.calculateDuty());
        System.out.println("---");

        System.out.println(myHgv.toString());
        System.out.println("Import Duty: " + myHgv.calculateDuty());
    }
}