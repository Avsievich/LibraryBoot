package ru.springboot.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.springboot.model.Stackoverflow;
import ru.springboot.persistence.StackoverflowWebsiteRepository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class StackoverflowService {
    @Autowired
    StackoverflowWebsiteRepository repository;

    public Iterable<Stackoverflow> findAll() {

       return repository.findAll();
    }




}