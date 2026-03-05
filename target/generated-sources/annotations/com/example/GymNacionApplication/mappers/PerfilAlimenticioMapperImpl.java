package com.example.GymNacionApplication.mappers;

import com.example.GymNacionApplication.dtos.PerfilAlimenticioRequestDTO;
import com.example.GymNacionApplication.dtos.PerfilAlimenticioResponseDTO;
import com.example.GymNacionApplication.model.Perfil;
import com.example.GymNacionApplication.model.PerfilAlimenticio;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-04T22:05:17-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.12 (Oracle Corporation)"
)
@Component
public class PerfilAlimenticioMapperImpl implements PerfilAlimenticioMapper {

    @Override
    public PerfilAlimenticio toEntity(PerfilAlimenticioRequestDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PerfilAlimenticio perfilAlimenticio = new PerfilAlimenticio();

        perfilAlimenticio.setPerfil( perfilAlimenticioRequestDTOToPerfil( dto ) );
        perfilAlimenticio.setTipoDieta( dto.getTipoDieta() );
        perfilAlimenticio.setComidasPorDia( dto.getComidasPorDia() );
        perfilAlimenticio.setAlergias( dto.getAlergias() );

        return perfilAlimenticio;
    }

    @Override
    public PerfilAlimenticioResponseDTO toDto(PerfilAlimenticio entidad) {
        if ( entidad == null ) {
            return null;
        }

        PerfilAlimenticioResponseDTO perfilAlimenticioResponseDTO = new PerfilAlimenticioResponseDTO();

        perfilAlimenticioResponseDTO.setId( entidad.getId() );
        perfilAlimenticioResponseDTO.setTipoDieta( entidad.getTipoDieta() );
        perfilAlimenticioResponseDTO.setComidasPorDia( entidad.getComidasPorDia() );

        return perfilAlimenticioResponseDTO;
    }

    protected Perfil perfilAlimenticioRequestDTOToPerfil(PerfilAlimenticioRequestDTO perfilAlimenticioRequestDTO) {
        if ( perfilAlimenticioRequestDTO == null ) {
            return null;
        }

        Perfil perfil = new Perfil();

        perfil.setId( perfilAlimenticioRequestDTO.getPerfilId() );

        return perfil;
    }
}
