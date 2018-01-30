package ru.springboot.persistence;


import org.springframework.data.domain.Page;
import org.springframework.data.repository.CrudRepository;

import org.springframework.data.repository.Repository;
import ru.springboot.model.StackoverflowWebsite;

import java.util.List;


public interface StackoverflowWebsiteRepository extends CrudRepository<StackoverflowWebsite, Long> {

}

