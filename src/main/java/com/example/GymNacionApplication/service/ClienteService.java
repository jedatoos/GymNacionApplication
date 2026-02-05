package com.example.GymNacionApplication.service;

import com.example.GymNacionApplication.dtos.ClienteRequestDTO;
import com.example.GymNacionApplication.dtos.ClienteResponseDTO;

import java.util.List;

public interface ClienteService {
    ClienteResponseDTO crearCliente(ClienteRequestDTO request);
    ClienteResponseDTO actualizarCliente(Long id, ClienteRequestDTO request);
    List<ClienteResponseDTO> listarClientes();
    void deshabilitarCliente(Long id);
}
