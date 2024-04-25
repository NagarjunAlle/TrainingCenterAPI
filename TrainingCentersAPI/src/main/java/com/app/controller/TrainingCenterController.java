package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.app.model.TrainingCenter;
import com.app.service.TrainingCenterService;

import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/training-centers")
public class TrainingCenterController {
    @Autowired
    private TrainingCenterService trainingCenterService;

    @PostMapping
    public ResponseEntity<TrainingCenter> createTrainingCenter(@Valid @RequestBody TrainingCenter trainingCenter) {
        TrainingCenter savedTrainingCenter = trainingCenterService.save(trainingCenter);
        return ResponseEntity.ok(savedTrainingCenter);
    }

    @GetMapping
    public ResponseEntity<List<TrainingCenter>> getAllTrainingCenters() {
        List<TrainingCenter> trainingCenters = trainingCenterService.getAll();
        return ResponseEntity.ok(trainingCenters);
    }
}

