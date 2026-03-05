package com.example.GymNacionApplication.dtos;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class RutinaRequestDTO {
    private Long perfilId;
    private String tipoRutina; // Ej: "Hipertrofia", "Fuerza"
    private String nivel;      // Ej: "Principiante", "Intermedio"
    private LocalDate fechaCreacion;
}
