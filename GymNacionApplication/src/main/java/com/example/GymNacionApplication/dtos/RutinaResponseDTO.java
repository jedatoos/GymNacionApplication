package com.example.GymNacionApplication.dtos;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class RutinaResponseDTO {
    private Long id;
    private String tipoRutina;
    private String nivel;
    private LocalDate fechaCreacion;
}
