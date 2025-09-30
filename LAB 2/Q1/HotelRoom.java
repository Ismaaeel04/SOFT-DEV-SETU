class HotelRoom
{

    private int roomNumber;
    private String roomType;
    private int availability;
    private double rate;

    public HotelRoom()
    {
        roomNumber = 0;
        roomType = "";
        availability=0;
        rate=0;
        
    }

    public int SetRoomNumber(int number)
    {
        roomNumber = number;
        return roomNumber;
    }

    public void SetSingle()
    {
        roomType = "Single";
    }

    public void SetDouble()
    {
        roomType = "Double";
    }

    public void PrintDetails()
    {
        System.out.println("Room Number is " + roomNumber + ", type is " + roomType);
        System.out.println("Room availability: " + availability);
        System.out.println("Price: " + rate);
    }

    public int SetRoomAvailability(int availabilityhotel)
    {

        availability=availabilityhotel;

        return availability;


    }

    public double SetPricePernight(double price)
    {

        rate=price;

        return rate;

    }

    public boolean isOccupied()
    {

        if(availability==0){

            return false;

        }

        return true;

    }

}