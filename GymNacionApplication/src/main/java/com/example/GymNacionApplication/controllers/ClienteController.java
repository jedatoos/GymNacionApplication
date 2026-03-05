package com.example.GymNacionApplication.controllers;



import com.example.GymNacionApplication.dtos.ClienteRequestDTO;
import com.example.GymNacionApplication.dtos.ClienteResponseDTO;
import com.example.GymNacionApplication.service.IClienteService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/clientes")
@RequiredArgsConstructor
public class ClienteController {

    private final IClienteService clienteService;


    @GetMapping
    public List<ClienteResponseDTO> listar() {
        return clienteService.listarClientes();
    }

    @PostMapping
    public ResponseEntity<ClienteResponseDTO> crear(
            @Valid @RequestBody ClienteRequestDTO request) {

        ClienteResponseDTO response = clienteService.crearCliente(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @PutMapping("/{id}")
    public ClienteResponseDTO actualizar(
            @PathVariable Long id,
            @Valid @RequestBody ClienteRequestDTO request) {

        return clienteService.actualizarCliente(id, request);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarLogico(@PathVariable Long id) {
        clienteService.deshabilitarCliente(id);
        return ResponseEntity.noContent().build();
    }
}