package com.example.GymNacionApplication.service;

import com.example.GymNacionApplication.dtos.RutinaRequestDTO;
import com.example.GymNacionApplication.dtos.RutinaResponseDTO;
import com.example.GymNacionApplication.mappers.RutinaMapper;
import com.example.GymNacionApplication.model.Rutina;
import com.example.GymNacionApplication.repository.RutinaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class RutinaServiceImpl implements IRutinaService {

    private final RutinaRepository repository;
    private final RutinaMapper mapper;

    @Override
    public RutinaResponseDTO guardar(RutinaRequestDTO dto) {
        Rutina entidad = mapper.toEntity(dto);
        // Si la fecha viene nula, la seteamos por defecto a hoy
        if (entidad.getFechaCreacion() == null) {
            entidad.setFechaCreacion(LocalDate.now());
        }
        return mapper.toDto(repository.save(entidad));
    }
}