public class HotelApp {

    public static void main(String[] args) {
        FrontDesk frontDesk = new FrontDesk();

        frontDesk.requestValet("AFP 1220");

        frontDesk.requestHouseKeeping(101);

        frontDesk.requestCart(2);
    }
}
