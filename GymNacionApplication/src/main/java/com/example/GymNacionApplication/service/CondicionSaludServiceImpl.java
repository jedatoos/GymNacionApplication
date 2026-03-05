package com.example.GymNacionApplication.service;

import com.example.GymNacionApplication.dtos.CondicionSaludRequestDTO;
import com.example.GymNacionApplication.dtos.CondicionSaludResponseDTO;
import com.example.GymNacionApplication.mappers.CondicionSaludMapper;
import com.example.GymNacionApplication.model.CondicionSalud;
import com.example.GymNacionApplication.repository.CondicionSaludRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CondicionSaludServiceImpl implements ICondicionSaludService {
    private final CondicionSaludRepository condicionSaludRepository;
    private final CondicionSaludMapper condicionSaludMapper;

    public CondicionSaludResponseDTO guardarCondicion(CondicionSaludRequestDTO dto) {
        // Convertimos DTO a Entidad
        CondicionSalud condicion = condicionSaludMapper.toEntity(dto);

        // Guardamos
        CondicionSalud guardada = condicionSaludRepository.save(condicion);

        // Devolvemos el ResponseDTO
        return condicionSaludMapper.toDto(guardada);
}
}
