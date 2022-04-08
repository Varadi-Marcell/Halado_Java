package org.example;

import java.util.List;

public class CourseDto {
    private Long id;
    private String name;
    private List<StudentDto> studentsList;

    public CourseDto(Long id, String name, List<StudentDto> studentsList) {
        this.id = id;
        this.name = name;
        this.studentsList = studentsList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<StudentDto> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(List<StudentDto> studentsList) {
        this.studentsList = studentsList;
    }
}
