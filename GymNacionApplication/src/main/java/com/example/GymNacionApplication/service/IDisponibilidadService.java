package com.example.GymNacionApplication.service;

import com.example.GymNacionApplication.dtos.DisponibilidadRequestDTO;
import com.example.GymNacionApplication.dtos.DisponibilidadResponseDTO;

public interface IDisponibilidadService {
    DisponibilidadResponseDTO guardar(DisponibilidadRequestDTO dto);
}