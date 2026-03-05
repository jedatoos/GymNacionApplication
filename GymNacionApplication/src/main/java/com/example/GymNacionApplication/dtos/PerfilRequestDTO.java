package com.example.GymNacionApplication.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PerfilRequestDTO {
    private Long clienteId;
    private Integer mesesEntrenando;
    private String objetivo;
    private Integer edad;
    private String sexo;
    private Double pesoKg;
    private Double estaturaCm;
    private String nivelActividad;
    private Integer horasSueno;
}
