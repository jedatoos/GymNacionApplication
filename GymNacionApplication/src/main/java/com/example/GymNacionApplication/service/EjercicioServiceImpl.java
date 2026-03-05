package com.example.GymNacionApplication.service;

import com.example.GymNacionApplication.dtos.EjercicioRequestDTO;
import com.example.GymNacionApplication.dtos.EjercicioResponseDTO;
import com.example.GymNacionApplication.mappers.EjercicioMapper;
import com.example.GymNacionApplication.model.Ejercicio;
import com.example.GymNacionApplication.repository.EjercicioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EjercicioServiceImpl implements IEjercicioService {

    private final EjercicioRepository repository;
    private final EjercicioMapper mapper;

    @Override
    public EjercicioResponseDTO guardar(EjercicioRequestDTO dto) {
        Ejercicio entidad = mapper.toEntity(dto);
        return mapper.toDto(repository.save(entidad));
    }
}
