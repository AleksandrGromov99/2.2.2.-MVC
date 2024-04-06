package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Component
public class CarServiceImpl implements CarService{

        private static int CARS_COUNT;
        private List<Car> cars;

        {
            cars = new ArrayList<>();
            cars.add(new Car("Ford", "black", ++CARS_COUNT));
            cars.add(new Car("Opel", "white", ++CARS_COUNT));
            cars.add(new Car("BMW", "blue", ++CARS_COUNT));
            cars.add(new Car("Toyota", "grey", ++CARS_COUNT));
            cars.add(new Car("Mazda", "red", ++CARS_COUNT));
            cars.add(new Car("BMW", "red", ++CARS_COUNT));
            cars.add(new Car("Mercedes", "red", ++CARS_COUNT));
            cars.add(new Car("VW", "red", ++CARS_COUNT));
            cars.add(new Car("Peugeot", "red", ++CARS_COUNT));
            cars.add(new Car("Nissan", "red", ++CARS_COUNT));
        }

        @Override
        public List<Car> show (int count){
            return cars.stream().filter(car -> car.getId()<=count).collect(Collectors.toList());
        }

}
