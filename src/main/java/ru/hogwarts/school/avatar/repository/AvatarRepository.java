package ru.hogwarts.school.avatar.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import ru.hogwarts.school.avatar.entity.Avatar;

import java.util.Optional;

public interface AvatarRepository extends PagingAndSortingRepository<Avatar, Long> {
    Optional<Avatar> findByStudentId(Long studentId);

}
