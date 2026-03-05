package com.example.GymNacionApplication.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PerfilResponseDTO {
    private Long id; // Fundamental para que el Front lo use en los siguientes pasos
    private String objetivo;
    private Double pesoKg;
}