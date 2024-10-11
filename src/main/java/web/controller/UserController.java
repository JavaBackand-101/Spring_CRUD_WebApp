package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import web.models.User;
import web.service.UserService;

@Controller
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String getUsers(ModelMap model) {
        model.addAttribute("users", userService.getAllUsers());
        return "users";
    }

    @GetMapping("/add")
    public String showAddUserForm(ModelMap model) {
        model.addAttribute("user", new User());
        return "user"; // возвращает страницу с формой для добавления пользователя
    }



    @PostMapping("/add")
    public String addUser(@ModelAttribute User user) {
        userService.addUser(user);
        return "redirect:/users"; // исправлено
    }

    @GetMapping("/update")
    public String showUpdateUserForm(ModelMap model) {
        model.addAttribute("users", userService.getAllUsers());
        return "update";
    }

    @PostMapping("/update")
    public String updateUser(@ModelAttribute User user) {
        userService.updateUser(user);
        return "redirect:/users"; // исправлено
    }

    @GetMapping("/delete")
    public String showDeleteUserForm(ModelMap model) {
        model.addAttribute("users", userService.getAllUsers());
        return "delete";
    }

    @PostMapping("/delete")
    public String deleteUser(@ModelAttribute User user) {
        userService.deleteUser(user);
        return "redirect:/users"; // исправлено
    }
}

