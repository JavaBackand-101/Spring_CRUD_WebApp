package web.service;

import models.Car;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CarService {

    List<Car> getCars(int id);


}
