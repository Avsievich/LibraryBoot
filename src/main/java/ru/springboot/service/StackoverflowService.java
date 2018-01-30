package ru.springboot.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.springboot.model.StackoverflowWebsite;
import ru.springboot.persistence.StackoverflowWebsiteRepository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class StackoverflowService {
    @Autowired
    StackoverflowWebsiteRepository repository;

    private static List<StackoverflowWebsite> item = new ArrayList<StackoverflowWebsite>();

    static {
        item.add(new StackoverflowWebsite("", "sxsxsxsxsxsx", "sxsxsxsxsxs",
                "sxsxsxsxsx", "sxsxsxsxxs"));
        item.add(new StackoverflowWebsite("", "sdsdsdsds", "sdsdsds",
                "sdsdsdsd", "sdsdsdsdsdsds"));
        item.add(new StackoverflowWebsite("", "ghnghnghng", "ghnhgnghnghn",
                "ghnghnghng", "nghnghnghng"));

    }
@PostConstruct
    public void init()
    {
        repository.save(item);
    }

    public List<StackoverflowWebsite> findAll() {
        return repository.findAll();
    }
}
