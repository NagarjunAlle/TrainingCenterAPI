package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.model.TrainingCenter;

@Repository
public interface TrainingCenterRepository extends JpaRepository<TrainingCenter, Long> {
}
