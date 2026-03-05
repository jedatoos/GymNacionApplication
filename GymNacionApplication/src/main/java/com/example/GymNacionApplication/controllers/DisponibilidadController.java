package com.example.GymNacionApplication.controllers;

import com.example.GymNacionApplication.dtos.DisponibilidadRequestDTO;
import com.example.GymNacionApplication.dtos.DisponibilidadResponseDTO;
import com.example.GymNacionApplication.service.IDisponibilidadService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/disponibilidad")
@RequiredArgsConstructor
public class DisponibilidadController {

    private final IDisponibilidadService disponibilidadService;

    @PostMapping
    public ResponseEntity<DisponibilidadResponseDTO> crear(@RequestBody DisponibilidadRequestDTO dto) {
        return new ResponseEntity<>(disponibilidadService.guardar(dto), HttpStatus.CREATED);
    }
}