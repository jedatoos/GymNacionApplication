package com.example.GymNacionApplication.mappers;

import com.example.GymNacionApplication.dtos.DisponibilidadRequestDTO;
import com.example.GymNacionApplication.dtos.DisponibilidadResponseDTO;
import com.example.GymNacionApplication.model.DisponibilidadEntrenamiento;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface DisponibilidadMapper {
    @Mapping(target = "perfil.id", source = "perfilId")
    DisponibilidadEntrenamiento toEntity(DisponibilidadRequestDTO dto);

    DisponibilidadResponseDTO toDto(DisponibilidadEntrenamiento entidad);
}