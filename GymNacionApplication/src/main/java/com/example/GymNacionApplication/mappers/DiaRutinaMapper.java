package com.example.GymNacionApplication.mappers;

import com.example.GymNacionApplication.dtos.DiaRutinaRequestDTO;
import com.example.GymNacionApplication.dtos.DiaRutinaResponseDTO;
import com.example.GymNacionApplication.model.DiaRutina;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface DiaRutinaMapper {

    @Mapping(target = "rutina.id", source = "rutinaId")
    @Mapping(target = "id", ignore = true)
    DiaRutina toEntity(DiaRutinaRequestDTO dto);

    DiaRutinaResponseDTO toDto(DiaRutina diaRutina);
}