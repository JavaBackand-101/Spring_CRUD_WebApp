package web.Dao;


import org.springframework.stereotype.Repository;
import web.models.Car;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

@Repository
public class CarDAOImp implements CarDAO {

    @PersistenceContext
    private EntityManager em;



    @Override
    public void add(Car car) {
        em.persist(car);
    }

    @Override
    public void update(Car car) {
        em.merge(car);
    }

    @Override
    public void delete(Car car) {
        em.remove(car);
    }

}
