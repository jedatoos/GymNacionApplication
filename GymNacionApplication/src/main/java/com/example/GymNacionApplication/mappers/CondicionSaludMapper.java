package com.example.GymNacionApplication.mappers;


import com.example.GymNacionApplication.dtos.CondicionSaludRequestDTO;
import com.example.GymNacionApplication.dtos.CondicionSaludResponseDTO;
import com.example.GymNacionApplication.model.CondicionSalud;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CondicionSaludMapper {

    @Mapping(target = "perfil.id", source = "perfilId")
    @Mapping(target = "id", ignore = true)
    CondicionSalud toEntity(CondicionSaludRequestDTO dto);

    CondicionSaludResponseDTO toDto(CondicionSalud condicionSalud);
}