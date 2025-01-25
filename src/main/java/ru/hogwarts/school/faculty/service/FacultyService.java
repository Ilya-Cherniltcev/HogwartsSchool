package ru.hogwarts.school.faculty.service;

import ru.hogwarts.school.faculty.entity.Faculty;

import java.util.Collection;

public interface FacultyService {

    Faculty createFaculty(Faculty faculty);

    Faculty getFaculty(long id);

    Faculty updateFaculty(Faculty faculty);

    void deleteFaculty(long id);

    Collection<Faculty> filterFacultyByColorOrByName(String color, String name);

    Faculty getFacultyByStudentId(long studId);

    // ========== Task 4.5 (Параллельные стримы) =============
    String getFacultiesLongestName();

}
