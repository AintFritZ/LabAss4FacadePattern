public class Cart implements HotelService {

    @Override
    public void service() {
        System.out.println("Performing cart service.");
    }

    public void requestCart(int numberOfCarts) {
        System.out.println("Requesting " + numberOfCarts + " luggage carts.");
    }
}