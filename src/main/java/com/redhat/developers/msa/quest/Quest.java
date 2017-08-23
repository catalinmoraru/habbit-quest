package com.redhat.developers.msa.quest;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by catalin.moraru on 26.01.2017.
 */

@Entity
public class Quest {

    @Id
    private Integer id;
    private String name;
    private String description;

    public Quest(){

    }

    public Quest(Integer id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
                return description;
    }

    public void setDescription(String description) {
                this.description = description;
    }
}
