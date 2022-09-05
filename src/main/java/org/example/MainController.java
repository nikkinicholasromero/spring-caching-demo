package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> main() {
        return userRepository.findAll();
    }
}
