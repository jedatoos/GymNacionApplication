package com.example.GymNacionApplication.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EjercicioRutinaResponseDTO {
    private Long id;
    private Integer series;
    private Integer repeticiones;
    private Integer descansoSegundos;
}