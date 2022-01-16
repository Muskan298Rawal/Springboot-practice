package com.example.userProject.Service;

import com.example.userProject.Model.UserModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    static List<UserModel> userList = new ArrayList<UserModel>(Arrays.asList(
            new UserModel(1, "muskan", "bhopal", 7999),
            new UserModel(2, "priya", "jabalpur", 8962)
    ));

    public List<UserModel> getUsersList(){
        return userList;
    }

    public UserModel getUserById(Integer id){
        return userList.stream().filter(user -> user.getId() == id).findFirst().get();
    }

    public void deleteUserById(Integer id){
        userList.removeIf(user -> user.getId() == id);
    }

    public void addNewUser(UserModel newUser){
        userList.add(newUser);
    }

    public void updateUser(UserModel data, Integer id){
        for(int i=0;i<userList.size();i++){
            if(userList.get(i).getId() == id){
                userList.get(i).setId(data.getId());
                userList.get(i).setName(data.getName());
                userList.get(i).setCity(data.getCity());
                userList.get(i).setNumber(data.getNumber());
                return;
            }
        }
    }
}
