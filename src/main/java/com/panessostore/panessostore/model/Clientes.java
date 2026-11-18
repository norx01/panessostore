package com.panessostore.panessostore.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "clientes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Clientes
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_cliente;

    @NotBlank(message = "El nombre no puede estar vacío")
    private String nombre;

    private String documento;

    @NotNull(message = "La edad no puede estar vacía")
    private Integer edad;

    @NotNull(message = "La fecha de nacimiento no puede estar vacía")
    private LocalDate fecha_nacimiento;

    private String telefono;
    private String direccion;
    private String correo;

}
