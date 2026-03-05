package com.example.GymNacionApplication.mappers;

import com.example.GymNacionApplication.dtos.ClienteRequestDTO;
import com.example.GymNacionApplication.dtos.ClienteResponseDTO;
import com.example.GymNacionApplication.model.Cliente;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-04T22:05:17-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.12 (Oracle Corporation)"
)
@Component
public class ClienteMapperImpl implements ClienteMapper {

    @Override
    public Cliente toEntity(ClienteRequestDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Cliente cliente = new Cliente();

        cliente.setNombre( dto.getNombre() );
        cliente.setApellido( dto.getApellido() );
        cliente.setTelefono( dto.getTelefono() );
        cliente.setEmail( dto.getEmail() );
        cliente.setPassword( dto.getPassword() );

        return cliente;
    }

    @Override
    public ClienteResponseDTO toDto(Cliente cliente) {
        if ( cliente == null ) {
            return null;
        }

        ClienteResponseDTO clienteResponseDTO = new ClienteResponseDTO();

        clienteResponseDTO.setId( cliente.getId() );
        clienteResponseDTO.setNombre( cliente.getNombre() );
        clienteResponseDTO.setApellido( cliente.getApellido() );
        clienteResponseDTO.setTelefono( cliente.getTelefono() );
        clienteResponseDTO.setEmail( cliente.getEmail() );
        clienteResponseDTO.setPassword( cliente.getPassword() );

        return clienteResponseDTO;
    }
}
