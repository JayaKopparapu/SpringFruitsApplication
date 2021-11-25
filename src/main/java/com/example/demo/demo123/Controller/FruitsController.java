package com.example.demo.demo123.Controller;

import com.example.demo.demo123.Repository.FruitsRepository;
import com.example.demo.demo123.entities.Fruits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/demo/fruits")
public class FruitsController {

//    @Autowired
    private FruitsRepository fruitsRepository;

    @GetMapping
    public List<Fruits> getAllFruits(){
        return fruitsRepository.findAll();
    }

}
