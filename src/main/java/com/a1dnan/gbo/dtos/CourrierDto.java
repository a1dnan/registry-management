package com.a1dnan.gbo.dtos;

import com.a1dnan.gbo.entities.Courrier;
import com.a1dnan.gbo.entities.Departement;
import com.a1dnan.gbo.entities.Employe;
import com.a1dnan.gbo.entities.Expediteur;
import com.a1dnan.gbo.entities.enums.TypeCourrier;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class CourrierDto {

    private Long id;
    private String objet;
    private LocalDate date;
    private TypeCourrier type;
    private Long  expediteurId;
    private Long departementId;
    private Long employeId;

    public static CourrierDto fromEntity(Courrier courrier){
        return CourrierDto.builder()
                .id(courrier.getId())
                .date(courrier.getDate())
                .objet(courrier.getObjet())
                .type(courrier.getType())
                .departementId(courrier.getDepartement().getId())
                .expediteurId(courrier.getExpediteur().getId())
                .employeId(courrier.getEmploye().getId())
                .build();
    }

    public static Courrier toEntity(CourrierDto courrier){
        return Courrier.builder()
                .id(courrier.getId())
                .type(courrier.getType())
                .objet(courrier.getObjet())
                .departement(
                        Departement.builder()
                                .id(courrier.getDepartementId())
                                .build()
                )
                .expediteur(
                        Expediteur.builder()
                                .id(courrier.getExpediteurId())
                                .build()
                )
                .employe(
                        Employe.builder()
                                .id(courrier.getEmployeId())
                                .build()
                )
                .build();
    }

}
