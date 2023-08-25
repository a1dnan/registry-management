package com.a1dnan.gbo.entities;

import com.a1dnan.gbo.entities.enums.TypeCourrier;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@SuperBuilder
public class Courrier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String objet;
    private LocalDate date;

    @Enumerated(EnumType.STRING)
    private TypeCourrier type;

    @OneToOne
    private Expediteur expediteur;
    @OneToOne
    private Departement departement;
    @OneToOne
    private Employe employe;


}
