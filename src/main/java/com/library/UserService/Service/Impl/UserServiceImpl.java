package com.library.UserService.Service.Impl;

import com.library.UserService.Entity.User;
import com.library.UserService.Exception.UserNotFoundException;
import com.library.UserService.Repo.UserRepo;
import com.library.UserService.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo userRepo;

    public UserServiceImpl() {
    }

    public List<User> getAllUsers() {
        return List.of();
    }

    public User getUserByid(Integer id) {
        Optional<User> byId = this.userRepo.findById(id);
        return (User)byId.get();
    }

    public User addUser(User user) {
        User save = (User)this.userRepo.save(user);
        return save;
    }

    public User updateUser(User user) {
        return null;
    }

    public void deleteUser(Integer id) {
        Optional<User> byId = userRepo.findById(id);
        if(byId.isPresent()) userRepo.deleteById(id);
        else throw new UserNotFoundException("Invalid user");
    }
}
