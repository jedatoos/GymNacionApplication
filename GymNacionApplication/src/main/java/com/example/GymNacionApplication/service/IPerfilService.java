package com.example.GymNacionApplication.service;

import com.example.GymNacionApplication.dtos.PerfilRequestDTO;
import com.example.GymNacionApplication.dtos.PerfilResponseDTO;

public interface IPerfilService {
    PerfilResponseDTO guardar(PerfilRequestDTO dto);
}