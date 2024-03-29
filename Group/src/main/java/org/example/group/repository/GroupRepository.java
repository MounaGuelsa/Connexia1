package org.example.group.repository;

import org.example.group.entity.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GroupRepository extends JpaRepository<Group,Long> {
    List<Group> findByDeletedFalse();

    List<Group> findGroupByAdmin(Long adminId);
}
