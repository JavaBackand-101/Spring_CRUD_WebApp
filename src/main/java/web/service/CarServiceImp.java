package web.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.Dao.CarDAO;
import web.models.Car;

import javax.transaction.Transactional;

@Service
public class CarServiceImp implements CarService {

    private CarDAO carDAO;

    @Autowired
    public CarServiceImp(CarDAO carDAO) {
        this.carDAO = carDAO;
    }


    @Transactional
    @Override
    public void add(Car car) {
        carDAO.add(car);
    }

    @Transactional
    @Override
    public void update(Car car) {
        carDAO.update(car);
    }

    @Transactional
    @Override
    public void delete(Car car) {
        carDAO.delete(car);
    }




}
