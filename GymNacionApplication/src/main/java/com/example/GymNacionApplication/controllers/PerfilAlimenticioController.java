package com.example.GymNacionApplication.controllers;

import com.example.GymNacionApplication.dtos.PerfilAlimenticioRequestDTO;
import com.example.GymNacionApplication.dtos.PerfilAlimenticioResponseDTO;
import com.example.GymNacionApplication.service.IPerfilAlimenticioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/perfil-alimenticio")
@RequiredArgsConstructor
public class PerfilAlimenticioController {

    private final IPerfilAlimenticioService perfilAlimenticioService;

    @PostMapping
    public ResponseEntity<PerfilAlimenticioResponseDTO> crear(@RequestBody PerfilAlimenticioRequestDTO dto) {
        return new ResponseEntity<>(perfilAlimenticioService.guardar(dto), HttpStatus.CREATED);
    }
}