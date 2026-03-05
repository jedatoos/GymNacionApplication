package com.example.GymNacionApplication.service;

import com.example.GymNacionApplication.dtos.PerfilRequestDTO;
import com.example.GymNacionApplication.dtos.PerfilResponseDTO;
import com.example.GymNacionApplication.mappers.PerfilMapper;
import com.example.GymNacionApplication.model.Perfil;
import com.example.GymNacionApplication.repository.PerfilRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PerfilServiceImpl implements IPerfilService {

    private final PerfilRepository repository;
    private final PerfilMapper mapper;

    @Override
    public PerfilResponseDTO guardar(PerfilRequestDTO dto) {
        Perfil entidad = mapper.toEntity(dto);
        return mapper.toDto(repository.save(entidad));
    }
}