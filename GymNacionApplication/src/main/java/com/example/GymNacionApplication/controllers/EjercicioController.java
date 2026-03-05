package com.example.GymNacionApplication.controllers;

import com.example.GymNacionApplication.dtos.EjercicioRequestDTO;
import com.example.GymNacionApplication.dtos.EjercicioResponseDTO;
import com.example.GymNacionApplication.service.IEjercicioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ejercicios")
@RequiredArgsConstructor
public class EjercicioController {

    private final IEjercicioService ejercicioService;

    @PostMapping
    public ResponseEntity<EjercicioResponseDTO> crear(@RequestBody EjercicioRequestDTO dto) {
        return new ResponseEntity<>(ejercicioService.guardar(dto), HttpStatus.CREATED);
    }
}
