package com.example.demo.demo123.Repository;

import com.example.demo.demo123.entities.Fruits;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface FruitsRepository extends JpaRepository<Fruits, Long> {

}
