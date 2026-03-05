package com.example.GymNacionApplication.mappers;

import com.example.GymNacionApplication.dtos.EjercicioRequestDTO;
import com.example.GymNacionApplication.dtos.EjercicioResponseDTO;
import com.example.GymNacionApplication.model.Ejercicio;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EjercicioMapper {
    Ejercicio toEntity(EjercicioRequestDTO dto);
    EjercicioResponseDTO toDto(Ejercicio entidad);
}