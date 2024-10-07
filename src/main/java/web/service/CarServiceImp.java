package web.service;

import models.Car;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class CarServiceImp implements CarService {

    private final List<Car> cars;

    public CarServiceImp() {
        cars = new ArrayList<>(List.of(
                new Car("Mercedec", "Black", 2003),
                new Car("Lexus", "White", 2021),
                new Car("BMW", "Black", 2020),
                new Car("Lada", "White", 2008),
                new Car("Toyota", "Black", 2009)
        ));
    }



    public List<Car> getCars(int id) {
        if(id > cars.size()){
            return new ArrayList<>(cars);
        }
        return new ArrayList<>(cars.subList(0, id));
    }

}
