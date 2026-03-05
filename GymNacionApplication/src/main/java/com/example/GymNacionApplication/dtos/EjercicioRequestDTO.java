package com.example.GymNacionApplication.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EjercicioRequestDTO {
    private String nombre;
    private String grupoMuscular;
    private String equipamiento;
}