package com.example.GymNacionApplication.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EjercicioResponseDTO {
    private Long id;
    private String nombre;
    private String grupoMuscular;
    private String equipamiento;
}