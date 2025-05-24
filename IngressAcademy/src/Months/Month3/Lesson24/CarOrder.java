package Months.Month3.Lesson24;

import java.time.LocalDate;
import java.util.UUID;

public class CarOrder<T extends Car> {
    private String uuid;
    private T car;
    private String destinationCountry;
    private LocalDate deliveryDate;
    private DeliveryMethod deliveryMethod;

    public CarOrder(T car, String destinationCountry, DeliveryMethod deliveryMethod) {
        this.car = car;
        this.destinationCountry = destinationCountry;
        this.deliveryMethod = deliveryMethod;
        this.uuid = UUID.randomUUID().toString();
        deliveryDate = LocalDate.now().plusDays(40);
    }

    public void orderCars() {
        System.out.println("Order id: " + uuid);
        System.out.println("Delivery time: " + deliveryDate);
        System.out.println("Car info: " + "Brand " + car.getBrand() + "Model " + car.getModel());
    }
}
