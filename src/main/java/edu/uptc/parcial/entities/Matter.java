package edu.uptc.parcial.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "matters")
public class Matter {

    @Id
    @Column(length = 10, nullable = false)
    private String code;

    @Column(length = 45, nullable = false)
    private String description;

    @Column(length = 10, nullable = false)
    private String credits;


    public Matter() {
    }

    public Matter(String code, String description, String credits) {
        this.code = code;
        this.description = description;
        this.credits = credits;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCredits() {
        return credits;
    }

    public void setCredits(String credits) {
        this.credits = credits;
    }
}
