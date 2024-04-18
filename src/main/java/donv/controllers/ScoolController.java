package donv.controllers;

import donv.entities.School;
import donv.entities.Student;
import donv.services.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/schools")
public class ScoolController {

    @Autowired
    private SchoolService schoolService;

    @GetMapping
    public List<School> getAllSchools() {
        return schoolService.getAllSchools();
    }

    @GetMapping(value = "/{schoolId}")
    public School getSchoolById(@PathVariable Long schoolId) {
        return this.schoolService.getSchoolById(schoolId);
    }

    @GetMapping(value = "/{schoolId}/students")
    public List<Student> getAllStudentByScoolId(@PathVariable Long schoolId) {
        return this.schoolService.getSchoolById(schoolId).getStudents();
    }

    @GetMapping(value = "{schoolId}/students/{studentId}")
    public Student getStudentByScoolId(@PathVariable Long schoolId, @PathVariable Long studentId) {
        return this.schoolService.getStudentById(schoolId, studentId);
    }
}
