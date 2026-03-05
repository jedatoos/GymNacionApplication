package com.example.GymNacionApplication.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CondicionSaludResponseDTO {
    private Long id;
    private String tipo;
    private String descripcion;
}