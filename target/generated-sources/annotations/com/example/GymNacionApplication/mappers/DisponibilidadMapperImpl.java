package com.example.GymNacionApplication.mappers;

import com.example.GymNacionApplication.dtos.DisponibilidadRequestDTO;
import com.example.GymNacionApplication.dtos.DisponibilidadResponseDTO;
import com.example.GymNacionApplication.model.DisponibilidadEntrenamiento;
import com.example.GymNacionApplication.model.Perfil;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-04T22:05:17-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.12 (Oracle Corporation)"
)
@Component
public class DisponibilidadMapperImpl implements DisponibilidadMapper {

    @Override
    public DisponibilidadEntrenamiento toEntity(DisponibilidadRequestDTO dto) {
        if ( dto == null ) {
            return null;
        }

        DisponibilidadEntrenamiento disponibilidadEntrenamiento = new DisponibilidadEntrenamiento();

        disponibilidadEntrenamiento.setPerfil( disponibilidadRequestDTOToPerfil( dto ) );
        disponibilidadEntrenamiento.setDiasPorSemana( dto.getDiasPorSemana() );
        disponibilidadEntrenamiento.setMinutosPorSesion( dto.getMinutosPorSesion() );

        return disponibilidadEntrenamiento;
    }

    @Override
    public DisponibilidadResponseDTO toDto(DisponibilidadEntrenamiento entidad) {
        if ( entidad == null ) {
            return null;
        }

        DisponibilidadResponseDTO disponibilidadResponseDTO = new DisponibilidadResponseDTO();

        disponibilidadResponseDTO.setId( entidad.getId() );
        disponibilidadResponseDTO.setDiasPorSemana( entidad.getDiasPorSemana() );
        disponibilidadResponseDTO.setMinutosPorSesion( entidad.getMinutosPorSesion() );

        return disponibilidadResponseDTO;
    }

    protected Perfil disponibilidadRequestDTOToPerfil(DisponibilidadRequestDTO disponibilidadRequestDTO) {
        if ( disponibilidadRequestDTO == null ) {
            return null;
        }

        Perfil perfil = new Perfil();

        perfil.setId( disponibilidadRequestDTO.getPerfilId() );

        return perfil;
    }
}
