package com.example.GymNacionApplication.repository;

import com.example.GymNacionApplication.model.DisponibilidadEntrenamiento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DisponibilidadRepository extends JpaRepository<DisponibilidadEntrenamiento, Long> {

}