package Months.Month3.Lesson24;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<CarOrder<? extends Car>> list = new ArrayList<>();
        list.add(new CarOrder<>(new Toyota(),"AZ",DeliveryMethod.SHIP));
        list.add(new CarOrder<>(new Bmw(),"AZ",DeliveryMethod.SHIP));

        for (CarOrder<? extends Car> order:list){
            order.orderCars();
        }

    }
}
