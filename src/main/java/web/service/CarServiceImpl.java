package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Ford", "black", 2));
        cars.add(new Car("Opel", "white", 3));
        cars.add(new Car("BMW", "blue", 1));
        cars.add(new Car("Toyota", "grey", 7));
        cars.add(new Car("Mazda", "red", 10));
    }

    @Override
    public List<Car> show(int count) {
        if (count > 5) {
            return cars;
        } else {
            return cars.subList(0, count);
        }
    }
}
