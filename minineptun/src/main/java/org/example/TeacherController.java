package org.example;

import java.util.List;

public interface TeacherController {
    List<CourseDto> getAllCourseWithStudens(Long CourseId);
}
