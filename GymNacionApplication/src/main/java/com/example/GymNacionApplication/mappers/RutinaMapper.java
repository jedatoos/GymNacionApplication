package com.example.GymNacionApplication.mappers;
import com.example.GymNacionApplication.dtos.RutinaRequestDTO;
import com.example.GymNacionApplication.dtos.RutinaResponseDTO;
import com.example.GymNacionApplication.model.Rutina;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
@Mapper(componentModel = "spring")
public interface RutinaMapper {

    @Mapping(target = "perfil.id", source = "perfilId")
    @Mapping(target = "id", ignore = true)
    Rutina toEntity(RutinaRequestDTO dto);

    RutinaResponseDTO toDto(Rutina entidad);
}
