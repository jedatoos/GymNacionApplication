package com.example.GymNacionApplication.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PerfilAlimenticioResponseDTO {
    private Long id;
    private String tipoDieta;
    private Integer comidasPorDia;
}