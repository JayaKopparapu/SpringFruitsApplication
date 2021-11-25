package com.example.demo.demo123;

import com.example.demo.demo123.Repository.FruitsRepository;
import com.example.demo.demo123.entities.Fruits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.demo.demo123.Controller"})
public class Demo123Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Demo123Application.class, args);
    }
//    @Autowired
    private FruitsRepository fruitsRepository;


    @Override
    public void run(String... args) throws Exception
    {
        Fruits fruit= new Fruits();
        fruit.setId(1);
        fruit.setName("Apple");
        fruit.setColor("Red");
        fruit.setAvailability("true");
        fruitsRepository.save(fruit);

        Fruits fruit1= new Fruits();
        fruit1.setId(2);
        fruit1.setName("Mango");
        fruit1.setColor("Yellow");
        fruit1.setAvailability("false");
        fruitsRepository.save(fruit1);
    }
}
