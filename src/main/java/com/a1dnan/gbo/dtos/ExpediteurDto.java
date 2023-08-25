package com.a1dnan.gbo.dtos;

import com.a1dnan.gbo.entities.Expediteur;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class ExpediteurDto {

    private Long id;
    private String nom;
    private String adresse;
    private String phone;
    private Long courrierId;

    public static ExpediteurDto fromEntity(Expediteur expediteur){
        return ExpediteurDto.builder()
                .id(expediteur.getId())
                .adresse(expediteur.getAdresse())
                .nom(expediteur.getNom())
                .phone(expediteur.getPhone())
                .courrierId(expediteur.getCourrier() == null ? null :expediteur.getCourrier().getId())
                .build();
    }

    public static Expediteur toEntity(ExpediteurDto expediteur){
        return Expediteur.builder()
                .id(expediteur.getId())
                .nom(expediteur.getNom())
                .adresse(expediteur.getAdresse())
                .phone(expediteur.getPhone())
                .build();
    }
}
