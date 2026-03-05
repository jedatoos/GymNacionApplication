package com.example.GymNacionApplication.mappers;
import com.example.GymNacionApplication.dtos.PerfilRequestDTO;
import com.example.GymNacionApplication.dtos.PerfilResponseDTO;
import com.example.GymNacionApplication.model.Perfil;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
@Mapper(componentModel = "spring")
public interface PerfilMapper {

    @Mapping(target = "cliente.id", source = "clienteId")
    @Mapping(target = "id", ignore = true)
    Perfil toEntity(PerfilRequestDTO dto);

    PerfilResponseDTO toDto(Perfil entidad);
}