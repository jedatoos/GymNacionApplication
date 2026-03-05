package com.example.GymNacionApplication.controllers;

import com.example.GymNacionApplication.dtos.EjercicioRutinaRequestDTO;
import com.example.GymNacionApplication.dtos.EjercicioRutinaResponseDTO;
import com.example.GymNacionApplication.service.IEjercicioRutinaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ejercicios-rutina")
@RequiredArgsConstructor
public class EjercicioRutinaController {

    private final IEjercicioRutinaService ejercicioRutinaService;

    @PostMapping
    public ResponseEntity<EjercicioRutinaResponseDTO> crear(@RequestBody EjercicioRutinaRequestDTO dto) {
        return new ResponseEntity<>(ejercicioRutinaService.guardar(dto), HttpStatus.CREATED);
    }
}