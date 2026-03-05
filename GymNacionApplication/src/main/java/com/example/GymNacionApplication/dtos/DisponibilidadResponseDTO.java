package com.example.GymNacionApplication.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DisponibilidadResponseDTO {
    private Long id;
    private Integer diasPorSemana;
    private Integer minutosPorSesion;
    // No devolvemos el objeto Perfil entero para evitar bucles en el JSON
}
