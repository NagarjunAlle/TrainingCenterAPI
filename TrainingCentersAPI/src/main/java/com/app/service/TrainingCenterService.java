package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.TrainingCenter;
import com.app.repository.TrainingCenterRepository;

import java.util.List;

@Service
public class TrainingCenterService {
    @Autowired
    private TrainingCenterRepository trainingCenterRepository;

    public TrainingCenter save(TrainingCenter trainingCenter) {
        trainingCenter.setCreatedOn(System.currentTimeMillis());
        return trainingCenterRepository.save(trainingCenter);
    }

    public List<TrainingCenter> getAll() {
        return trainingCenterRepository.findAll();
    }
}

