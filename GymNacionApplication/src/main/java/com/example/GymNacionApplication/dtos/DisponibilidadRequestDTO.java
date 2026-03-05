package com.example.GymNacionApplication.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DisponibilidadRequestDTO {
    private Long perfilId;
    private Integer diasPorSemana;
    private Integer minutosPorSesion;
}