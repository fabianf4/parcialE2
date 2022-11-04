package edu.uptc.parcial.entities;

import javax.persistence.*;

@Entity
@Table(name = "student_matter")
public class Student_matter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private Matter matter;

    @ManyToOne
    private Student student;

    public Student_matter(Matter matter, Student student) {
        this.matter = matter;
        this.student = student;
    }

    public Student_matter() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Matter getMatter() {
        return matter;
    }

    public void setMatter(Matter matter) {
        this.matter = matter;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
