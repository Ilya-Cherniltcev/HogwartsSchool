package ru.hogwarts.school.faculty.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.hogwarts.school.faculty.entity.Faculty;

import java.util.Collection;

public interface FacultyRepository extends JpaRepository<Faculty, Long> {


    Collection<Faculty> getFacultyByColorIgnoreCaseOrNameIgnoreCase(String color, String name);

    Faculty getFacultyByStudentsId(long studId);

}
