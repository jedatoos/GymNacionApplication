package com.example.GymNacionApplication.service;

import com.example.GymNacionApplication.dtos.EjercicioRutinaRequestDTO;
import com.example.GymNacionApplication.dtos.EjercicioRutinaResponseDTO;
import com.example.GymNacionApplication.mappers.EjercicioRutinaMapper;
import com.example.GymNacionApplication.model.EjercicioRutina;
import com.example.GymNacionApplication.repository.EjercicioRutinaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EjercicioRutinaServiceImpl implements IEjercicioRutinaService {

    private final EjercicioRutinaRepository repository;
    private final EjercicioRutinaMapper mapper;

    @Override
    public EjercicioRutinaResponseDTO guardar(EjercicioRutinaRequestDTO dto) {
        EjercicioRutina entidad = mapper.toEntity(dto);
        return mapper.toDto(repository.save(entidad));
    }
}
