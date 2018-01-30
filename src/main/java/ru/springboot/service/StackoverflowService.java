package ru.springboot.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.springboot.model.StackoverflowWebsite;
import ru.springboot.persistence.StackoverflowWebsiteRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class StackoverflowService {
    @Autowired
    StackoverflowWebsiteRepository repository;

    public List<StackoverflowWebsite> findAll() {

        repository.findAll(); //fun with Java 8

    }

}

//    private static List<StackoverflowWebsite> item = new ArrayList<StackoverflowWebsite>();
//
//    static {
//        item.add(new StackoverflowWebsite("", "sxsxsxsxsxsx", "sxsxsxsxsxs",
//                "sxsxsxsxsx", "sxsxsxsxxs"));
//        item.add(new StackoverflowWebsite("", "sdsdsdsds", "sdsdsds",
//                "sdsdsdsd", "sdsdsdsdsdsds"));
//        item.add(new StackoverflowWebsite("", "ghnghnghng", "ghnhgnghnghn",
//                "ghnghnghng", "nghnghnghng"));
//
//    }
//@PostConstruct
//    public void init()
//    {
//        repository.save(item);
//    }



