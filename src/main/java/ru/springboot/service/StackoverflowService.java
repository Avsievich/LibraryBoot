package ru.springboot.service;


import org.springframework.stereotype.Service;
import ru.springboot.model.StackoverflowWebsite;

import java.util.ArrayList;
import java.util.List;

@Service
public class StackoverflowService {
    private static List<StackoverflowWebsite> item = new ArrayList<StackoverflowWebsite>();

    static {
        item.add(new StackoverflowWebsite("", "sxsxsxsxsxsx", "sxsxsxsxsxs",
                "sxsxsxsxsx", "sxsxsxsxxs"));
        item.add(new StackoverflowWebsite("", "sdsdsdsds", "sdsdsds",
                "sdsdsdsd", "sdsdsdsdsdsds"));
        item.add(new StackoverflowWebsite("", "ghnghnghng", "ghnhgnghnghn",
                "ghnghnghng", "nghnghnghng"));

    }

    public List<StackoverflowWebsite> findAll() {
        return item;
    }
}
