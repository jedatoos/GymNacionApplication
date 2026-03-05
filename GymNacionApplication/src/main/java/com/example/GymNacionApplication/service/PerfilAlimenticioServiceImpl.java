package com.example.GymNacionApplication.service;

import com.example.GymNacionApplication.dtos.PerfilAlimenticioRequestDTO;
import com.example.GymNacionApplication.dtos.PerfilAlimenticioResponseDTO;
import com.example.GymNacionApplication.mappers.PerfilAlimenticioMapper;
import com.example.GymNacionApplication.model.PerfilAlimenticio;
import com.example.GymNacionApplication.repository.PerfilAlimenticioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PerfilAlimenticioServiceImpl implements IPerfilAlimenticioService {

    private final PerfilAlimenticioRepository repository;
    private final PerfilAlimenticioMapper mapper;

    @Override
    public PerfilAlimenticioResponseDTO guardar(PerfilAlimenticioRequestDTO dto) {
        PerfilAlimenticio entidad = mapper.toEntity(dto);
        return mapper.toDto(repository.save(entidad));
    }
}
