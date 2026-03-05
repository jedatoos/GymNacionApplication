package com.example.GymNacionApplication.service;

import com.example.GymNacionApplication.dtos.DisponibilidadRequestDTO;
import com.example.GymNacionApplication.dtos.DisponibilidadResponseDTO;
import com.example.GymNacionApplication.mappers.DisponibilidadMapper;
import com.example.GymNacionApplication.model.DisponibilidadEntrenamiento;
import com.example.GymNacionApplication.repository.DisponibilidadRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class DisponibilidadServiceImpl implements IDisponibilidadService {

    private final DisponibilidadRepository repository;
    private final DisponibilidadMapper mapper;

    @Override
    @Transactional // Asegura que la operación sea atómica
    public DisponibilidadResponseDTO guardar(DisponibilidadRequestDTO dto) {
        DisponibilidadEntrenamiento entidad = mapper.toEntity(dto);
        DisponibilidadEntrenamiento guardado = repository.save(entidad);
        return mapper.toDto(guardado);
    }


}