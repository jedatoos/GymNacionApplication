package com.example.GymNacionApplication.dtos;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClienteResponseDTO {

    private Long id;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
}
