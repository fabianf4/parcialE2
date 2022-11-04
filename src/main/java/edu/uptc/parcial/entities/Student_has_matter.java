package edu.uptc.parcial.entities;

import javax.persistence.*;

    @Entity
    @Table(name = "student_has_matter")
    public class Student_has_matter {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        @ManyToOne
        private Student student;

        @ManyToOne
        private Matter matter;

        public Student_has_matter(Student student, Matter matter) {
            this.student = student;
            this.matter = matter;
        }

        public Student_has_matter() {
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Student getStudent() {
            return student;
        }

        public void setStudent(Student student) {
            this.student = student;
        }

        public Matter getMatter() {
            return matter;
        }

        public void setMatter(Matter matter) {
            this.matter = matter;
        }
    }

