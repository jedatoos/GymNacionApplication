package com.example.GymNacionApplication.mappers;

import com.example.GymNacionApplication.dtos.CondicionSaludRequestDTO;
import com.example.GymNacionApplication.dtos.CondicionSaludResponseDTO;
import com.example.GymNacionApplication.model.CondicionSalud;
import com.example.GymNacionApplication.model.Perfil;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-04T22:05:17-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.12 (Oracle Corporation)"
)
@Component
public class CondicionSaludMapperImpl implements CondicionSaludMapper {

    @Override
    public CondicionSalud toEntity(CondicionSaludRequestDTO dto) {
        if ( dto == null ) {
            return null;
        }

        CondicionSalud condicionSalud = new CondicionSalud();

        condicionSalud.setPerfil( condicionSaludRequestDTOToPerfil( dto ) );
        condicionSalud.setTipo( dto.getTipo() );
        condicionSalud.setDescripcion( dto.getDescripcion() );

        return condicionSalud;
    }

    @Override
    public CondicionSaludResponseDTO toDto(CondicionSalud condicionSalud) {
        if ( condicionSalud == null ) {
            return null;
        }

        CondicionSaludResponseDTO condicionSaludResponseDTO = new CondicionSaludResponseDTO();

        condicionSaludResponseDTO.setId( condicionSalud.getId() );
        condicionSaludResponseDTO.setTipo( condicionSalud.getTipo() );
        condicionSaludResponseDTO.setDescripcion( condicionSalud.getDescripcion() );

        return condicionSaludResponseDTO;
    }

    protected Perfil condicionSaludRequestDTOToPerfil(CondicionSaludRequestDTO condicionSaludRequestDTO) {
        if ( condicionSaludRequestDTO == null ) {
            return null;
        }

        Perfil perfil = new Perfil();

        perfil.setId( condicionSaludRequestDTO.getPerfilId() );

        return perfil;
    }
}
