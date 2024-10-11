package web.Dao;

import web.models.Car;

public interface CarDAO {

    public void add(Car car);
    public void update(Car car);
    public void delete(Car car);
}
