package com.example.GymNacionApplication.repository;

import com.example.GymNacionApplication.model.EjercicioRutina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EjercicioRutinaRepository extends JpaRepository<EjercicioRutina, Long> {
}
