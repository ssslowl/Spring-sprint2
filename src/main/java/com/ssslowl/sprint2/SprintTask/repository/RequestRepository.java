package com.ssslowl.sprint2.SprintTask.repository;


import com.ssslowl.sprint2.SprintTask.entity.ApplicationRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface RequestRepository  extends JpaRepository<ApplicationRequest, Long> {

    @Query("SELECT r FROM ApplicationRequest r WHERE r.handled = ?1")
    List<ApplicationRequest> FindAllByHandled(Boolean isHandled);

}
