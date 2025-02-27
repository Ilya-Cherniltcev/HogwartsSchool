package ru.hogwarts.school.student.service;

import ru.hogwarts.school.student.entity.Student;

import java.util.Collection;
import java.util.List;

public interface StudentService {

    Student createStudent(Student student);

    Student getStudent(long id);

    Student updateStudent(Student student);

    void deleteStudent(long id);

    Collection<Student> filter(int age);

    Collection<Student> findStudentsByAgeBetween(int minAge, int maxAge);

    Collection<Student> getAllStudentsByFacultyId(long facId);

    // ======= Получение общего количества студентов ===============
    int getTotalNumberOfStudents();

    // ======= Получение среднего возраста студентов ===============
    double getAverageAgeOfStudents();

    // ======= Получение последних 5-ти студентов (у которых больше id) ===============
    List<Student> getLast5Students();

    // ----- TASK 4.5 -----
    // ---- Получение имен всех студентов, чье имя начинается с буквы {letter} ----
    List<String> getNamesOfStudentsWithFirstLetter(char letter);

    // шаг 2  ---- возвращаем средний возраст всех студентов, используя стримы  ----------------
    Double getAverageAgeOfStudentsWithStreams();

    // =========  Домашка № 4.6 (потоки)  ==========================================
    // шаг 1  ---- получаем список всех студентов и выводим их в консоль  ----------------

    void printAllStudents();

    // шаг 2  ---- получаем список всех студентов и выводим их в консоль синхронизированным методом ----------------

    void printAllStudentsSynchro();

}
