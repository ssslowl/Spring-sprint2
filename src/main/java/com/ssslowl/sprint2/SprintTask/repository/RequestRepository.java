package com.ssslowl.sprint2.SprintTask.repository;


import com.ssslowl.sprint2.SprintTask.entity.ApplicationRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RequestRepository  extends JpaRepository<ApplicationRequest, Long> {
}
