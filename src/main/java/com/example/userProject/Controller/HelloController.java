package com.example.userProject.Controller;

import com.example.userProject.Model.UserModel;
import org.springframework.web.bind.annotation.*;

import com.example.userProject.Service.UserService;

import java.util.List;

@RestController
public class HelloController {

    @GetMapping("/users")
    public List<UserModel> getUsers(){
        return UserService.getUsersList();
    }

    @GetMapping("/users/{id}")
    public UserModel getSingleUser(@PathVariable Integer id){
        return UserService.getUserById(id);
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable Integer id){
        UserService.deleteUserById(id);
    }

    @PostMapping("/users")
    public void addUser(@RequestBody UserModel newUser){
        UserService.addNewUser(newUser);
    }

    @PutMapping("/users/{id}")
    public void updateUser(@RequestBody UserModel data, @PathVariable Integer id ){
        UserService.updateUser(data, id);
    }

}
