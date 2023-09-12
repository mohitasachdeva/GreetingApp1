package com.example.greetingapp.greetingcontroller;

import com.example.greetingapp.model.User;
import com.example.greetingapp.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GreetingController {
    @Autowired
    private GreetingService greetingService;

    //Rest Api
    //Post Api
    @PostMapping("/addGreet")
    public User add(@RequestBody User greetingModel) {
        return greetingService.save(greetingModel);
    }

    @PostMapping("/addGreets")
    public List<User> add(@RequestBody List<User> greetingModel) {
        return greetingService.saveGreet(greetingModel);
    }

    //Get Api
    @GetMapping("/getGreet")
    public List<User> findAllGreet() {
        return greetingService.getGreet();
    }

    //get by id
    @GetMapping("/getById/{id}")
    public User findProductById(@PathVariable int id) {
        return greetingService.getGreetById(id);
    }

    //getbyname
    @GetMapping("/getByName/{name}")
    public User findProductByName(@PathVariable String name) {
        return greetingService.getGreetByName(name);
    }

    //put
    @PutMapping("/Update")
    public User updateGreets(@RequestBody User greetingModel) {
        return greetingService.updateGreet(greetingModel);
    }

    //delete
    @DeleteMapping("/Delete/{id}")
    public String deleteGreet(@PathVariable int id) {
        return greetingService.deleteGreet(id);
    }
}
