package ru.springboot.persistence;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.springboot.model.Stackoverflow;

@Repository
public interface StackoverflowWebsiteRepository extends CrudRepository<Stackoverflow, String> {


    //Iterable<Stackoverflow> findAllBy(String website);
}

