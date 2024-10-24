public class Valet implements HotelService {

    @Override
    public void service() {
        System.out.println("Performing valet service.");
    }

    public void pickUpVehicle(String plateNumber) {
        System.out.println("Vehicle with plate number " + plateNumber + " will be parked.");
    }
}