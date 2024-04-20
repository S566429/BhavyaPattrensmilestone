package com.example.DogManagementSystem.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.DogManagementSystem.Models.Trainer;

public interface TrainerRepository extends CrudRepository<Trainer, Integer> {

}