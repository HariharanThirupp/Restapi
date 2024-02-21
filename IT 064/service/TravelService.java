package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Travel;
import com.example.demo.repository.TravelRepo;

@Service
public class TravelService {
    @Autowired
    TravelRepo repo;
    
    public Travel addTravel(Travel t)
    {
        return repo.save(t);
    }

    public List<Travel> getTravelId()
    {
        return repo.findAll();
    }
    public Optional<Travel> getById(Integer id)
    {
        return repo.findById(id);
    }
}
