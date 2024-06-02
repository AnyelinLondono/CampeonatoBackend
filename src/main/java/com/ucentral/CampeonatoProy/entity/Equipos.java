package com.ucentral.CampeonatoProy.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@Entity
@RequiredArgsConstructor
@NoArgsConstructor
public class Equipos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NonNull
    private String nombre;

    @NonNull
    private String uniforme;

    @NonNull
    private String tecnico;

    @NonNull
    private String patrocinador;

    @NonNull
    private String direccion;

    @NonNull
    private String estadioLocal;
}
