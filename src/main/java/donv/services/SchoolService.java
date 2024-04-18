package donv.services;

import donv.entities.School;
import donv.entities.Student;
import donv.repositories.SchoolRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SchoolService {
    private final SchoolRepository schoolRepository;

    public List<School> getAllSchools() {
        return schoolRepository.findAll();
    }

    public School getSchoolById(Long schoolId) {
        Optional<School> school = schoolRepository.findById(schoolId);
        if (school.isEmpty()) {
            throw new RuntimeException("School not found with id: " + schoolId);
        }
        return school.get();
    }

    public Student getStudentById(Long schoolId, Long studentId) {
        School school = getSchoolById(schoolId);
        for (Student student : school.getStudents()) {
            if (student.getId().equals(studentId)) {
                return student;
            }
        }
        throw new RuntimeException("Student not found with id: " + studentId);
//        return school.getStudents().stream().filter(student -> student.getId().equals(studentId)).findFirst()
//               .orElseThrow(() -> new RuntimeException("Student not found with id: " + studentId));

    }

}
