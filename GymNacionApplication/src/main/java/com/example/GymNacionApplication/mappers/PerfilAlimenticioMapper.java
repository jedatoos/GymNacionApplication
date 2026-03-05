package com.example.GymNacionApplication.mappers;

import com.example.GymNacionApplication.dtos.PerfilAlimenticioRequestDTO;
import com.example.GymNacionApplication.dtos.PerfilAlimenticioResponseDTO;
import com.example.GymNacionApplication.model.PerfilAlimenticio;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
@Mapper(componentModel = "spring")
public interface PerfilAlimenticioMapper {

    @Mapping(target = "perfil.id", source = "perfilId")
    @Mapping(target = "id", ignore = true)
    PerfilAlimenticio toEntity(PerfilAlimenticioRequestDTO dto);

    PerfilAlimenticioResponseDTO toDto(PerfilAlimenticio entidad);
}