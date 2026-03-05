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
@Table(name = "disponibilidad_entrenamiento")
public class DisponibilidadEntrenamiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "perfil_id", nullable = false)
    private Perfil perfil;

    private Integer diasPorSemana;

    private Integer minutosPorSesion;
}
