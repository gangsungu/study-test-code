package org.example.studytestcode.unit.order;

import java.time.LocalDateTime;
import java.util.List;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.example.studytestcode.unit.beverage.Beverage;

@Getter
@RequiredArgsConstructor
public class Order {

    private LocalDateTime orderDateTime;
    private List<Beverage> beverageList;

    public Order(LocalDateTime now, List<Beverage> beverageList) {
    }
}
