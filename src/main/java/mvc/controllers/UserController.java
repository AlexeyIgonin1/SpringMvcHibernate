package mvc.controllers;


import mvc.model.User;
import mvc.servic.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

@Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/table")
    public String tableUser(Model model){
        //Список всех машин
        model.addAttribute("users", userService.getAllUsers());
        return "users/table";
    }

    @GetMapping("/new")
    public String newPerson(@ModelAttribute("user_model") User user) {
        return "Users/new";
    }



}
