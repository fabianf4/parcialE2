package edu.uptc.parcial.entities;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 20, nullable = false)
    private String last_name;

    @Column(length = 20, nullable = false)
    private String name;

    private Date birthdate;

    @Column(length = 10)
    private String phone;

    public Student(int id, String last_name, String name, Date birthdate, String phone) {
        this.id = id;
        this.last_name = last_name;
        this.name = name;
        this.birthdate = birthdate;
        this.phone = phone;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
