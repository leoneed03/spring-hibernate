package com.ride;

import org.springframework.stereotype.Component;

@Component
public class Car implements Drivable {
    @Override
    public String drive() {
        return "CAR";
    }
}
