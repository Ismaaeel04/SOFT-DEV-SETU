public class HotelRoom2 {
public static void main(String[] args) {
    HotelRoom roomC = new HotelRoom();
    boolean number;
    roomC.SetRoomNumber(202);
    roomC.SetSingle();
    roomC.SetRoomAvailability(0);
    roomC.SetPricePernight(90);
    roomC.PrintDetails();
    number=roomC.isOccupied();
    System.out.println(number);
}

}