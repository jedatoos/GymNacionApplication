package com.example.GymNacionApplication.controllers;

import com.example.GymNacionApplication.dtos.DiaRutinaRequestDTO;
import com.example.GymNacionApplication.dtos.DiaRutinaResponseDTO;
import com.example.GymNacionApplication.service.IDiaRutinaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/dias-rutina")
@RequiredArgsConstructor
public class DiaRutinaController {

    private final IDiaRutinaService diaRutinaService;

    @PostMapping
    public ResponseEntity<DiaRutinaResponseDTO> crearDia(@RequestBody DiaRutinaRequestDTO dto) {
        return new ResponseEntity<>(diaRutinaService.guardarDia(dto), HttpStatus.CREATED);
    }
}