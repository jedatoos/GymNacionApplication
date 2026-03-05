package com.example.GymNacionApplication.service;

import com.example.GymNacionApplication.dtos.EjercicioRequestDTO;
import com.example.GymNacionApplication.dtos.EjercicioResponseDTO;

public interface IEjercicioService {
    EjercicioResponseDTO guardar(EjercicioRequestDTO dto);
}