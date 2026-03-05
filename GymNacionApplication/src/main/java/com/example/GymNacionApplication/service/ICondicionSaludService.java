package com.example.GymNacionApplication.service;


import com.example.GymNacionApplication.dtos.CondicionSaludRequestDTO;
import com.example.GymNacionApplication.dtos.CondicionSaludResponseDTO;

public interface ICondicionSaludService {
    CondicionSaludResponseDTO guardarCondicion(CondicionSaludRequestDTO dto);
}
