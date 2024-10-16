package web.service;

import web.models.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUsers();
    public void addUser(User user);
    public void updateUser(User user);
    public void deleteUser(User user);
}
