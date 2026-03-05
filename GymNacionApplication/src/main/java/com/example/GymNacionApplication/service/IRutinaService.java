package com.example.GymNacionApplication.service;

import com.example.GymNacionApplication.dtos.RutinaRequestDTO;
import com.example.GymNacionApplication.dtos.RutinaResponseDTO;

public interface IRutinaService {
    RutinaResponseDTO guardar(RutinaRequestDTO dto);
}
