package com.example.GymNacionApplication.service;

import com.example.GymNacionApplication.dtos.PerfilAlimenticioRequestDTO;
import com.example.GymNacionApplication.dtos.PerfilAlimenticioResponseDTO;

public interface IPerfilAlimenticioService {
    PerfilAlimenticioResponseDTO guardar(PerfilAlimenticioRequestDTO dto);
}
