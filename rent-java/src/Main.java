import Model.RentableItem;

public class Main {
    public static void main(String[] args) {
        RentableItem car = new RentableItem("Car");
        System.out.println(car.rent());
        System.out.println(car.rent());

        System.out.println(car.returnItem());
        System.out.println(car.rent());
    }
}