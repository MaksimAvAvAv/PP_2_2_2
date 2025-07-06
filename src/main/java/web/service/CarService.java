package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    private final List<Car> cars;

    public CarService() {
        cars = new ArrayList<>();
        cars.add(new Car("Ford", "Fiesta", 2020));
        cars.add(new Car("Ford", "Focus", 2005));
        cars.add(new Car("Ford", "Mustang", 2021));
        cars.add(new Car("Ford", "Explorer", 2021));
        cars.add(new Car("Ford", "Bronco", 2022));
    }

    public List<Car> getCars(Integer count) {
        if (count == null || count >= cars.size()) {
            return new ArrayList<>(cars);
        } else {
            return new ArrayList<>(cars.subList(0, count));
        }
    }
}