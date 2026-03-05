package com.example.GymNacionApplication.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DiaRutinaRequestDTO {
    private Long rutinaId;     // ID de la rutina a la que pertenece
    private Integer numeroDia;  // Ej: 1, 2, 3...
    private String grupoMuscular; // Ej: "Pecho y Tríceps"
}