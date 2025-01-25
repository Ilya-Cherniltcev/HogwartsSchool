package ru.hogwarts.school.student.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.hogwarts.school.faculty.entity.Faculty;

import javax.persistence.*;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private int age;


    @ManyToOne
    @JoinColumn(name = "faculty_id")
    private Faculty faculty;


}
