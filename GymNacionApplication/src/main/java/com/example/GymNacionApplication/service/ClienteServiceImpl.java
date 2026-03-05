package com.example.GymNacionApplication.service;

import com.example.GymNacionApplication.repository.ClienteRepository;
import com.example.GymNacionApplication.dtos.ClienteRequestDTO;
import com.example.GymNacionApplication.dtos.ClienteResponseDTO;
import com.example.GymNacionApplication.errorResponse.BusinessException;
import com.example.GymNacionApplication.errorResponse.ResourceNotFoundException;
import com.example.GymNacionApplication.mappers.ClienteMapper;
import com.example.GymNacionApplication.model.Cliente;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ClienteServiceImpl implements IClienteService {

    private final ClienteRepository clienteRepository;
    private final  ClienteMapper clienteMapper;


    @Override
    public ClienteResponseDTO crearCliente(ClienteRequestDTO request) {

        // 1️⃣ Regla de negocio: email único
        if (clienteRepository.existsByEmail(request.getEmail())) {
            throw new BusinessException("El email ya está registrado");
        }

        // 2️⃣ DTO → Entity
        Cliente cliente = clienteMapper.toEntity(request);

        // 3️⃣ Guardar en BD
        Cliente clienteGuardado = clienteRepository.save(cliente);

        // 4️⃣ Entity → DTO
        return clienteMapper.toDto(clienteGuardado);
    }

    @Override
    public ClienteResponseDTO actualizarCliente(Long id, ClienteRequestDTO request) {

        Cliente cliente = clienteRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Cliente no encontrado"));

        cliente.setNombre(request.getNombre());
        cliente.setEmail(request.getEmail());
        cliente.setTelefono(request.getTelefono());

        Cliente actualizado = clienteRepository.save(cliente);

        return clienteMapper.toDto(actualizado);
    }

    @Override
    public List<ClienteResponseDTO> listarClientes() {
        return clienteRepository.findByActivoTrue()  // solo activos
                .stream()
                .map(clienteMapper::toDto)          // convierte a DTO
                .toList();
    }

    @Override
    public void deshabilitarCliente(Long id) {

        Cliente cliente = clienteRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Cliente no encontrado"));

        if (!cliente.getActivo()) {
            throw new BusinessException("El cliente ya está desactivado");
        }

        cliente.setActivo(false);
        clienteRepository.save(cliente);
    }
    }

