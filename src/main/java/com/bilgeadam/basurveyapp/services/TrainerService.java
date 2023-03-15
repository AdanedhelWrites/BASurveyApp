package com.bilgeadam.basurveyapp.services;

import com.bilgeadam.basurveyapp.entity.Trainer;
import com.bilgeadam.basurveyapp.repositories.TrainerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TrainerService {
    private final TrainerRepository trainerRepository;

    public Boolean createTrainer(Trainer trainer) {
        trainerRepository.save(trainer);
        return true;
    }

    public Optional<Trainer> findTrainerByUserOid(Long oid) {
        return trainerRepository.findTrainerByUserOid(oid);
    }

    public Optional<Trainer> findActiveById(Long trainerOid) {
        return trainerRepository.findActiveById(trainerOid);
    }
}