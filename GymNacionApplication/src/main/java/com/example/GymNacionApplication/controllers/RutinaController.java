package com.example.GymNacionApplication.controllers;

import com.example.GymNacionApplication.dtos.RutinaRequestDTO;
import com.example.GymNacionApplication.dtos.RutinaResponseDTO;
import com.example.GymNacionApplication.service.IRutinaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/rutinas")
@RequiredArgsConstructor
public class RutinaController {

    private final IRutinaService rutinaService;

    @PostMapping
    public ResponseEntity<RutinaResponseDTO> crear(@RequestBody RutinaRequestDTO dto) {
        return new ResponseEntity<>(rutinaService.guardar(dto), HttpStatus.CREATED);
    }
}