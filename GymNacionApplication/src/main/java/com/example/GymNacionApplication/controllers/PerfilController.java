package com.example.GymNacionApplication.controllers;

import com.example.GymNacionApplication.dtos.PerfilRequestDTO;
import com.example.GymNacionApplication.dtos.PerfilResponseDTO;
import com.example.GymNacionApplication.service.IPerfilService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/perfiles")
@RequiredArgsConstructor
public class PerfilController {

    private final IPerfilService perfilService;

    @PostMapping
    public ResponseEntity<PerfilResponseDTO> crear(@RequestBody PerfilRequestDTO dto) {
        return new ResponseEntity<>(perfilService.guardar(dto), HttpStatus.CREATED);
    }
}
