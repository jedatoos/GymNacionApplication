package com.example.GymNacionApplication.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CondicionSaludRequestDTO {
    private Long perfilId;
    private String tipo;
    private String descripcion;
}
