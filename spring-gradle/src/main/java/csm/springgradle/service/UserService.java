package csm.springgradle.service;

import csm.springgradle.entity.User;
import csm.springgradle.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    // post method
    public User saveUser(User user){
        return repository.save(user);
    }

    // get methods
    public List<User> getUser(){
            return repository.findAll();
        }

    public User getUserByID(int id){
        return repository.findById(id).orElse(null);
    }

    // fetching by name
    public User getUserByName(String name){
        return repository.findByName(name);
    }

    // delete method
    public String deleteUser(int id){
        repository.deleteById(id);
        return "User deleted" + id;
    }

    // update method
    public User updateUser(User user){
        User existingUser=repository.findById(user.getId()).orElse(null);
        existingUser.setName(user.getName());
        existingUser.setEmail(user.getEmail());
        existingUser.setPassword(user.getPassword());
        existingUser.setUserType(user.getUserType());
        return repository.save(existingUser);
    }

    // all
    public List<User> saveUser(List<User> users){
        return repository.saveAll(users);
    }


}
