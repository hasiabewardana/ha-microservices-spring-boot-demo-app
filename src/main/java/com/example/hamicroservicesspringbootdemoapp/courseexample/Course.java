package com.example.hamicroservicesspringbootdemoapp.courseexample;

public class Course {
    private int id;
    private String name;
    private String institution;

    public Course(int id, String name, String institution) {
        this.id = id;
        this.name = name;
        this.institution = institution;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getInstitution() {
        return institution;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", institution='" + institution + '\'' +
                '}';
    }
}
