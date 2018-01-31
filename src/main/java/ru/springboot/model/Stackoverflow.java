package ru.springboot.model;

import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.io.Serializable;

@Entity

public class Stackoverflow {

    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @EmbeddedId
    @Column (name = "id")
    private  String id;
    @Column (name = "iconImageUrl")
    private String iconImageUrl;
    @Column (name = "website")
    private  String website;
    @Column (name = "title")
    private  String title;
    @Column (name = "desscriptio")
    private String desscriptio;

    public Stackoverflow(){

    }
    public Stackoverflow(String id, String iconImageUrl, String website, String title, String desscriptio) {
        this.iconImageUrl = iconImageUrl;
      //  this.id = id;
        this.website = website;
        this.title = title;
        this.desscriptio = desscriptio;
    }

    public String getIconImageUrl() {
        return iconImageUrl;
    }

    public String getId() {
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
    @Override
    public String toString() {
        return String.format(" id ='%s,'iconImageUrl='%s', website='%s', title='%s', desscriptio='%s']",  id, iconImageUrl, website,title,desscriptio);
    }
}
