package com.example.greetingapp.service;

import com.example.greetingapp.model.User;
import com.example.greetingapp.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GreetingService {
    @Autowired
    private GreetingRepository greetingRepository;

    //Post method Saved Single Object
    public User save(User greetingModel) {
        return greetingRepository.save(greetingModel);
    }

    //Post method Saved list of Objects
    public List<User> saveGreet(List<User> greetingModel) {
        return greetingRepository.saveAll(greetingModel);
    }

    //get method return all
    public List<User> getGreet() {
        return greetingRepository.findAll();
    }

    //return by id
    public User getGreetById(int id) {
        return greetingRepository.findById(id).orElse(null);
    }

    //return by name
    public User getGreetByName(String name) {
        return greetingRepository.findByFirstName(name).get();
    }

    //delete
    public String deleteGreet(int id){
        greetingRepository.deleteById(id);
        return "Delete Succesfully";
    }


    public User updateGreet(int id, User greetingModel) {
        greetingModel.setId(id);
        return greetingRepository.save(greetingModel);
    }


}
