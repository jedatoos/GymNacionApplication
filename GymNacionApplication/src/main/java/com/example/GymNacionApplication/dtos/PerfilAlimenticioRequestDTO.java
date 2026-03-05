package com.example.GymNacionApplication.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PerfilAlimenticioRequestDTO {
    private Long perfilId;
    private String tipoDieta; // Ej: Vegana, Keto, Estándar
    private Integer comidasPorDia;
    private String alergias;
}
