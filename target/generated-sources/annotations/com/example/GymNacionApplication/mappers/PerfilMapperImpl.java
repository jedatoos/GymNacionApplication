package com.example.GymNacionApplication.mappers;

import com.example.GymNacionApplication.dtos.PerfilRequestDTO;
import com.example.GymNacionApplication.dtos.PerfilResponseDTO;
import com.example.GymNacionApplication.model.Cliente;
import com.example.GymNacionApplication.model.Perfil;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-04T22:05:17-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.12 (Oracle Corporation)"
)
@Component
public class PerfilMapperImpl implements PerfilMapper {

    @Override
    public Perfil toEntity(PerfilRequestDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Perfil perfil = new Perfil();

        perfil.setCliente( perfilRequestDTOToCliente( dto ) );
        perfil.setMesesEntrenando( dto.getMesesEntrenando() );
        perfil.setObjetivo( dto.getObjetivo() );
        perfil.setEdad( dto.getEdad() );
        perfil.setSexo( dto.getSexo() );
        perfil.setPesoKg( dto.getPesoKg() );
        perfil.setEstaturaCm( dto.getEstaturaCm() );
        perfil.setNivelActividad( dto.getNivelActividad() );
        perfil.setHorasSueno( dto.getHorasSueno() );

        return perfil;
    }

    @Override
    public PerfilResponseDTO toDto(Perfil entidad) {
        if ( entidad == null ) {
            return null;
        }

        PerfilResponseDTO perfilResponseDTO = new PerfilResponseDTO();

        perfilResponseDTO.setId( entidad.getId() );
        perfilResponseDTO.setObjetivo( entidad.getObjetivo() );
        perfilResponseDTO.setPesoKg( entidad.getPesoKg() );

        return perfilResponseDTO;
    }

    protected Cliente perfilRequestDTOToCliente(PerfilRequestDTO perfilRequestDTO) {
        if ( perfilRequestDTO == null ) {
            return null;
        }

        Cliente cliente = new Cliente();

        cliente.setId( perfilRequestDTO.getClienteId() );

        return cliente;
    }
}
