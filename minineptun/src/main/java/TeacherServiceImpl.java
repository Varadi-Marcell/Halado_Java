import org.example.*;

import java.util.List;
import java.util.stream.Collectors;

public class TeacherServiceImpl implements TeacherService {

    private final StudentRepository studentRepository;
    private final CourseRepository courseRepository;

    private final int TiredLimit=10;
    private final Long teacher_id;

    public TeacherServiceImpl(StudentRepository studentRepository, CourseRepository courseRepository, Integer teacher_id) {
        this.studentRepository = studentRepository;
        this.courseRepository = courseRepository;
        this.teacher_id = teacher_id;
    }

    @Override
    public List<StudentDto> getMyStudents() {
        List<CourseDto> courseListByTeacher=courseRepository.findByTeacher(teacher_id);

        return studentRepository.findByCourseId(courseListByTeacher.stream()
                .map(course->course.getId())
                .collect(Collectors.toList()));
    }

    @Override
    public boolean shouldBeTired() {
        return courseRepository.getElementCount()>TiredLimit;
    }
}
