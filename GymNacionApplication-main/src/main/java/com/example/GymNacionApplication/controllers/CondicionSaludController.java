package com.example.GymNacionApplication.controllers;

import com.example.GymNacionApplication.dtos.CondicionSaludRequestDTO;
import com.example.GymNacionApplication.dtos.CondicionSaludResponseDTO;
import com.example.GymNacionApplication.service.ICondicionSaludService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/condiciones-salud")
@RequiredArgsConstructor
public class CondicionSaludController {

    private final ICondicionSaludService condicionSaludService;

    @PostMapping
    public ResponseEntity<CondicionSaludResponseDTO> crear(@RequestBody CondicionSaludRequestDTO dto) {
        CondicionSaludResponseDTO response = condicionSaludService.guardarCondicion(dto);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}