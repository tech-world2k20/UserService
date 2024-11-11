package com.library.UserService.Controller;



import com.library.UserService.Entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @GetMapping("/getAllUsers")
    public List<User> getAllUserDetails(){
        return new ArrayList<>();
    }
}
