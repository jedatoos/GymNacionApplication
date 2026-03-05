package com.example.GymNacionApplication.mappers;

import com.example.GymNacionApplication.dtos.EjercicioRutinaRequestDTO;
import com.example.GymNacionApplication.dtos.EjercicioRutinaResponseDTO;
import com.example.GymNacionApplication.model.DiaRutina;
import com.example.GymNacionApplication.model.Ejercicio;
import com.example.GymNacionApplication.model.EjercicioRutina;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-04T22:05:17-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.12 (Oracle Corporation)"
)
@Component
public class EjercicioRutinaMapperImpl implements EjercicioRutinaMapper {

    @Override
    public EjercicioRutina toEntity(EjercicioRutinaRequestDTO dto) {
        if ( dto == null ) {
            return null;
        }

        EjercicioRutina ejercicioRutina = new EjercicioRutina();

        ejercicioRutina.setDiaRutina( ejercicioRutinaRequestDTOToDiaRutina( dto ) );
        ejercicioRutina.setEjercicio( ejercicioRutinaRequestDTOToEjercicio( dto ) );
        ejercicioRutina.setSeries( dto.getSeries() );
        ejercicioRutina.setRepeticiones( dto.getRepeticiones() );
        ejercicioRutina.setDescansoSegundos( dto.getDescansoSegundos() );

        return ejercicioRutina;
    }

    @Override
    public EjercicioRutinaResponseDTO toDto(EjercicioRutina entidad) {
        if ( entidad == null ) {
            return null;
        }

        EjercicioRutinaResponseDTO ejercicioRutinaResponseDTO = new EjercicioRutinaResponseDTO();

        ejercicioRutinaResponseDTO.setId( entidad.getId() );
        ejercicioRutinaResponseDTO.setSeries( entidad.getSeries() );
        ejercicioRutinaResponseDTO.setRepeticiones( entidad.getRepeticiones() );
        ejercicioRutinaResponseDTO.setDescansoSegundos( entidad.getDescansoSegundos() );

        return ejercicioRutinaResponseDTO;
    }

    protected DiaRutina ejercicioRutinaRequestDTOToDiaRutina(EjercicioRutinaRequestDTO ejercicioRutinaRequestDTO) {
        if ( ejercicioRutinaRequestDTO == null ) {
            return null;
        }

        DiaRutina diaRutina = new DiaRutina();

        diaRutina.setId( ejercicioRutinaRequestDTO.getDiaRutinaId() );

        return diaRutina;
    }

    protected Ejercicio ejercicioRutinaRequestDTOToEjercicio(EjercicioRutinaRequestDTO ejercicioRutinaRequestDTO) {
        if ( ejercicioRutinaRequestDTO == null ) {
            return null;
        }

        Ejercicio ejercicio = new Ejercicio();

        ejercicio.setId( ejercicioRutinaRequestDTO.getEjercicioId() );

        return ejercicio;
    }
}
