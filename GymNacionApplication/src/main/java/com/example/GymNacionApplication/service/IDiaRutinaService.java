package com.example.GymNacionApplication.service;

import com.example.GymNacionApplication.dtos.DiaRutinaRequestDTO;
import com.example.GymNacionApplication.dtos.DiaRutinaResponseDTO;

public interface IDiaRutinaService {
    DiaRutinaResponseDTO guardarDia(DiaRutinaRequestDTO dto);
}
