package csm.springgradle.controller;

import csm.springgradle.entity.User;
import csm.springgradle.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService service;

    // post
    @PostMapping("/addUser")
    public User addUser(@RequestBody User user){
        return service.saveUser(user);
    }

    // all
    public List<User> addUser(List<User> users){
        return service.saveUser(users);
    }

    // get
    @GetMapping("/userById/{id}")
    public User findUserById(@PathVariable int id){
        return service.getUserByID(id);
    }

    @GetMapping("/user/{name}")
    public User findUserByName(@PathVariable String name){
        return service.getUserByName(name);
    }

    // put
    @GetMapping("/userById")
    public User updateUser(@RequestBody User user){
        return service.updateUser(user);
    }

    // delete
    @DeleteMapping()
    public String deleteUser(@PathVariable int id){
        return service.deleteUser(id);
    }


}
