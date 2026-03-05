package com.example.GymNacionApplication.mappers;


import com.example.GymNacionApplication.dtos.ClienteRequestDTO;
import com.example.GymNacionApplication.dtos.ClienteResponseDTO;
import com.example.GymNacionApplication.model.Cliente;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring")
public interface ClienteMapper {

    // Respeta tu nombre: toEntity
    @Mapping(target = "id", ignore = true)
    Cliente toEntity(ClienteRequestDTO dto);

    // Respeta tu nombre: toDto
    ClienteResponseDTO toDto(Cliente cliente);
}
