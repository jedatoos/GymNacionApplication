package com.example.GymNacionApplication.mappers;

import com.example.GymNacionApplication.dtos.RutinaRequestDTO;
import com.example.GymNacionApplication.dtos.RutinaResponseDTO;
import com.example.GymNacionApplication.model.Perfil;
import com.example.GymNacionApplication.model.Rutina;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-04T22:05:17-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.12 (Oracle Corporation)"
)
@Component
public class RutinaMapperImpl implements RutinaMapper {

    @Override
    public Rutina toEntity(RutinaRequestDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Rutina rutina = new Rutina();

        rutina.setPerfil( rutinaRequestDTOToPerfil( dto ) );
        rutina.setTipoRutina( dto.getTipoRutina() );
        rutina.setNivel( dto.getNivel() );
        rutina.setFechaCreacion( dto.getFechaCreacion() );

        return rutina;
    }

    @Override
    public RutinaResponseDTO toDto(Rutina entidad) {
        if ( entidad == null ) {
            return null;
        }

        RutinaResponseDTO rutinaResponseDTO = new RutinaResponseDTO();

        rutinaResponseDTO.setId( entidad.getId() );
        rutinaResponseDTO.setTipoRutina( entidad.getTipoRutina() );
        rutinaResponseDTO.setNivel( entidad.getNivel() );
        rutinaResponseDTO.setFechaCreacion( entidad.getFechaCreacion() );

        return rutinaResponseDTO;
    }

    protected Perfil rutinaRequestDTOToPerfil(RutinaRequestDTO rutinaRequestDTO) {
        if ( rutinaRequestDTO == null ) {
            return null;
        }

        Perfil perfil = new Perfil();

        perfil.setId( rutinaRequestDTO.getPerfilId() );

        return perfil;
    }
}
