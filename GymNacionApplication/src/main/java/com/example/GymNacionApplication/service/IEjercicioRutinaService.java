package com.example.GymNacionApplication.service;

import com.example.GymNacionApplication.dtos.EjercicioRutinaRequestDTO;
import com.example.GymNacionApplication.dtos.EjercicioRutinaResponseDTO;

public interface IEjercicioRutinaService {
    EjercicioRutinaResponseDTO guardar(EjercicioRutinaRequestDTO dto);
}