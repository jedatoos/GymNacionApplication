package com.example.GymNacionApplication.mappers;

import com.example.GymNacionApplication.dtos.DiaRutinaRequestDTO;
import com.example.GymNacionApplication.dtos.DiaRutinaResponseDTO;
import com.example.GymNacionApplication.model.DiaRutina;
import com.example.GymNacionApplication.model.Rutina;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-04T22:05:17-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.12 (Oracle Corporation)"
)
@Component
public class DiaRutinaMapperImpl implements DiaRutinaMapper {

    @Override
    public DiaRutina toEntity(DiaRutinaRequestDTO dto) {
        if ( dto == null ) {
            return null;
        }

        DiaRutina diaRutina = new DiaRutina();

        diaRutina.setRutina( diaRutinaRequestDTOToRutina( dto ) );
        diaRutina.setNumeroDia( dto.getNumeroDia() );
        diaRutina.setGrupoMuscular( dto.getGrupoMuscular() );

        return diaRutina;
    }

    @Override
    public DiaRutinaResponseDTO toDto(DiaRutina diaRutina) {
        if ( diaRutina == null ) {
            return null;
        }

        DiaRutinaResponseDTO diaRutinaResponseDTO = new DiaRutinaResponseDTO();

        diaRutinaResponseDTO.setId( diaRutina.getId() );
        diaRutinaResponseDTO.setNumeroDia( diaRutina.getNumeroDia() );
        diaRutinaResponseDTO.setGrupoMuscular( diaRutina.getGrupoMuscular() );

        return diaRutinaResponseDTO;
    }

    protected Rutina diaRutinaRequestDTOToRutina(DiaRutinaRequestDTO diaRutinaRequestDTO) {
        if ( diaRutinaRequestDTO == null ) {
            return null;
        }

        Rutina rutina = new Rutina();

        rutina.setId( diaRutinaRequestDTO.getRutinaId() );

        return rutina;
    }
}
