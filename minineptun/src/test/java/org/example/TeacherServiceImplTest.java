package org.example;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class TeacherServiceImplTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void getMyStudents()
    {
        CourseRepository courseRepository = mock(CourseRepository.class);
        List<CourseDto> findByTeacherResult = new ArrayList<>();

        StudentRepository studentRepository = mock(StudentRepository.class);

        List<StudentDto> findByCourseIdResult = new ArrayList<>();
        when(studentRepository.findByCourseId(anyList())).thenReturn(findByCourseIdResult);
        findByCourseIdResult.add(new StudentDto(1L,"name 1","nc1"));
        findByCourseIdResult.add(new StudentDto(2L,"name 2","nc2"));
        findByCourseIdResult.add(new StudentDto(3L,"name 3","nc3"));



        when(courseRepository.findByTeacher(teacher_id)).thenReturn();
        CourseRepositry courseRepositry = mock(CourseRepository.class);;
        Long teacherId = 234L;

        TeacherServiceImpl teacherService = new TeacherServiceImpl(studentRepository,courseRepositry,teacherId);

        List<StudentDto> myStudents = teacher.
        assertTrue(getMyStudents().size(),3);
        verify(courseRepository,times(1)).findByTeacher(eq(teacherId));

    }
    
    @Test
    public boolean shoukdBeTired(){
        Long teacherId=234L;
        CourseRepository courseRepository = mock(CourseRepository.class);
        when(courseRepository.getElementCount(teacherId)).thenReturn(125);
        StudentRepository studentRepository = mock(StudentRepository.class);
        TeacherServiceImpl teacher = new TeacherServiceImpl(null,)
        return courseRepository.getElement
    }
}
