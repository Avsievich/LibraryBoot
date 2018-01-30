package ru.springboot.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.springboot.model.StackoverflowWebsite;
import ru.springboot.service.StackoverflowService;

import java.util.List;

@Controller
@RequestMapping("/ipa/stackoverflow")
public class StackoverflowController {
    @Autowired
    private StackoverflowService stackoverflowService;

    @RequestMapping
    public Iterable<StackoverflowWebsite> getListOfProviders() {
        return stackoverflowService.findAll();
    }
}
