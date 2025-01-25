package ru.hogwarts.school.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.hogwarts.school.student.entity.Student;

import java.util.Collection;
import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Collection<Student> findByAge(int age);

    Collection<Student> findByAgeBetween(int minAge, int maxAge);

    Collection<Student> findAllByFacultyId(long facId);

    @Query(value = "SELECT count(id) AS NumberofStudents FROM student", nativeQuery = true)
    int getNumberOfAllStudents();

    @Query(value = "SELECT avg(age) AS AverageAge FROM student", nativeQuery = true)
    double getAverageAgeOfStudents();

    @Query(value = "SELECT * FROM student ORDER BY id DESC LIMIT 5", nativeQuery = true)
    List<Student> getLast5Students();




}
