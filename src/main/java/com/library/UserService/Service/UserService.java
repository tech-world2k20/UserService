package com.library.UserService.Service;

import com.library.UserService.Dto.UserDto;
import com.library.UserService.Entity.User;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserService {


    public List<User> getAllUsers();

    public User getUserByid(Integer id);

    public User addUser(User user);

    public User updateUser(User user);

    public void deleteUser(Integer id);



}
