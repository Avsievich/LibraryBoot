package ru.springboot.persistence;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.springboot.model.StackoverflowWebsite;

import java.util.List;

@Repository
public interface StackoverflowWebsiteRepository extends  CrudRepository<StackoverflowWebsite, Long> {

}

