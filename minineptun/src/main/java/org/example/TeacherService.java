package org.example;

import java.util.List;

public interface TeacherService {

    List<CourseDto>getMyStudents();
    boolean shouldBeTired();
}
