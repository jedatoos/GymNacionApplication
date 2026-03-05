package com.example.GymNacionApplication.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "perfiles")
public class Perfil {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @OneToOne
    @JoinColumn(name = "cliente_id", nullable = false)
    private Cliente cliente;

    private Integer mesesEntrenando;

    private String objetivo;

    private Integer edad;

    private String sexo;

    private Double pesoKg;

    private Double estaturaCm;

    private String nivelActividad;

    private Integer horasSueno;
}

