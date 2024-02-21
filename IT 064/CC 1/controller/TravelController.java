package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Travel;
import com.example.demo.service.TravelService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class TravelController {
    @Autowired
    TravelService travelService;
    @PostMapping("/post")
    public Travel postMethodName(@RequestBody Travel t) {
        return travelService.addTravel(t);
    }
    @GetMapping("/get")
    public List<Travel> getMethodName() {
        return travelService.getTravelId();
    }
    @GetMapping("/get/{id}")
    public Optional<Travel> getById(@PathVariable ("id") int id)
    {
        return travelService.getById(id);
    }
    
    
    
}
