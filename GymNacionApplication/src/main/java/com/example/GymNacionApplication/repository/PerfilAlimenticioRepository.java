package com.example.GymNacionApplication.repository;

import com.example.GymNacionApplication.model.PerfilAlimenticio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerfilAlimenticioRepository extends JpaRepository<PerfilAlimenticio, Long> {
}