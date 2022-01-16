package com.example.userProject.Controller;

import com.example.userProject.Model.UserModel;
import org.springframework.web.bind.annotation.*;

import com.example.userProject.Service.UserService;

import java.util.List;

@RestController
public class HelloController {

    private UserService userService = new UserService();

    @GetMapping("/users")
    public List<UserModel> getUsers(){
        return userService.getUsersList();
    }

    @GetMapping("/users/{id}")
    public UserModel getSingleUser(@PathVariable Integer id){
        return userService.getUserById(id);
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable Integer id){
        userService.deleteUserById(id);
    }

    @PostMapping("/users")
    public void addUser(@RequestBody UserModel newUser){
        userService.addNewUser(newUser);
    }

    @PutMapping("/users/{id}")
    public void updateUser(@RequestBody UserModel data, @PathVariable Integer id ){
        userService.updateUser(data, id);
    }

}
