package com.a1dnan.gbo.dtos;

import com.a1dnan.gbo.entities.Courrier;
import com.a1dnan.gbo.entities.Departement;
import com.a1dnan.gbo.entities.Employe;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class EmployeDto {

    private Long id;
    private String nom;
    private String adresse;
    private String phone;
    private Long courrierId;
    private Long departementId;


    public static EmployeDto fromEntity(Employe employe){
        return EmployeDto.builder()
                .id(employe.getId())
                .nom(employe.getNom())
                .adresse(employe.getAdresse())
                .phone(employe.getPhone())
                .courrierId(employe.getCourrier() == null ? null :employe.getCourrier().getId())
                .departementId(employe.getDepartement().getId())
                .build();
    }

    public static Employe toEntity(EmployeDto employe){
        return Employe.builder()
                .id(employe.getId())
                .nom(employe.getNom())
                .adresse(employe.getAdresse())
                .phone(employe.getPhone())
                .departement(
                        Departement.builder()
                                .id(employe.getDepartementId())
                                .build()
                )
                .build();
    }



}
