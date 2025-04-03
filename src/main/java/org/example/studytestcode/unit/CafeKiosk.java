package org.example.studytestcode.unit;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import org.example.studytestcode.unit.beverage.Beverage;
import org.example.studytestcode.unit.order.Order;

@Getter
public class CafeKiosk {

    private final List<Beverage> beverageList = new ArrayList<>();

    public void add(Beverage beverage) {
        beverageList.add(beverage);
    }

    public void remove(Beverage beverage) {
        beverageList.remove(beverage);
    }

    public void clear() {
        beverageList.clear();
    }

    public int calculateTotalPrice() {
        int totalPrice = 0;
        for (Beverage beverage : beverageList) {
            totalPrice += beverage.getPrice();
        }

        return totalPrice;
    }

    public Order createOrder() {
        return new Order(LocalDateTime.now(), beverageList);
    }
}
