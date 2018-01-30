package ru.springboot.model;

import org.springframework.data.annotation.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class StackoverflowWebsite {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private final Long id;
    private final String iconImageUrl;

    private final String website;
    private final String title;
    private final String desscriptio;

    public StackoverflowWebsite(String iconImageUrl, Long id, String website, String title, String desscriptio) {
        this.iconImageUrl = iconImageUrl;
        this.id = id;
        this.website = website;
        this.title = title;
        this.desscriptio = desscriptio;
    }

    public String getIconImageUrl() {
        return iconImageUrl;
    }

    public Long getId() {
        return id;
    }

    public String getWebsite() {
        return website;
    }

    public String getTitle() {
        return title;
    }

    public String getDesscriptio() {
        return desscriptio;
    }
}
