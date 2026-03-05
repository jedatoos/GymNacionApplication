package com.example.GymNacionApplication.mappers;

import com.example.GymNacionApplication.dtos.EjercicioRutinaRequestDTO;
import com.example.GymNacionApplication.dtos.EjercicioRutinaResponseDTO;
import com.example.GymNacionApplication.model.EjercicioRutina;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring")
public interface EjercicioRutinaMapper {

    @Mapping(target = "diaRutina.id", source = "diaRutinaId")
    @Mapping(target = "ejercicio.id", source = "ejercicioId")
    @Mapping(target = "id", ignore = true)
    EjercicioRutina toEntity(EjercicioRutinaRequestDTO dto);

    EjercicioRutinaResponseDTO toDto(EjercicioRutina entidad);
}
