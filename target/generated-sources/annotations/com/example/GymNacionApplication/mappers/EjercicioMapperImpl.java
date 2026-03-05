package com.example.GymNacionApplication.mappers;

import com.example.GymNacionApplication.dtos.EjercicioRequestDTO;
import com.example.GymNacionApplication.dtos.EjercicioResponseDTO;
import com.example.GymNacionApplication.model.Ejercicio;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-04T22:05:17-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.12 (Oracle Corporation)"
)
@Component
public class EjercicioMapperImpl implements EjercicioMapper {

    @Override
    public Ejercicio toEntity(EjercicioRequestDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Ejercicio ejercicio = new Ejercicio();

        ejercicio.setNombre( dto.getNombre() );
        ejercicio.setGrupoMuscular( dto.getGrupoMuscular() );
        ejercicio.setEquipamiento( dto.getEquipamiento() );

        return ejercicio;
    }

    @Override
    public EjercicioResponseDTO toDto(Ejercicio entidad) {
        if ( entidad == null ) {
            return null;
        }

        EjercicioResponseDTO ejercicioResponseDTO = new EjercicioResponseDTO();

        ejercicioResponseDTO.setId( entidad.getId() );
        ejercicioResponseDTO.setNombre( entidad.getNombre() );
        ejercicioResponseDTO.setGrupoMuscular( entidad.getGrupoMuscular() );
        ejercicioResponseDTO.setEquipamiento( entidad.getEquipamiento() );

        return ejercicioResponseDTO;
    }
}
