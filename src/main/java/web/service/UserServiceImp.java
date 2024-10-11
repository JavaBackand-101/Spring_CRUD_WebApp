package web.service;


import web.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.Dao.UserDao;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImp implements UserService {

    private UserDao userDao;

    @Autowired
    public UserServiceImp(UserDao userDao) {
        this.userDao = userDao;
    }


@Override
    public List<User> getAllUsers(){
        return userDao.getAllUsers();
    }


    @Transactional
    @Override
    public void addUser(User user){
        userDao.addUser(user);
    }


    @Transactional
    @Override
    public void updateUser(User user){
        userDao.updateUser(user);
    }


    @Transactional
    @Override
    public void deleteUser(User user){
        userDao.deleteUser(user);
    }





}
