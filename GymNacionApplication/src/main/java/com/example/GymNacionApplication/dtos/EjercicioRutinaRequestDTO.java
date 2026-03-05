package com.example.GymNacionApplication.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EjercicioRutinaRequestDTO {
    private Long diaRutinaId;
    private Long ejercicioId;
    private Integer series;
    private Integer repeticiones;
    private Integer descansoSegundos;
}
