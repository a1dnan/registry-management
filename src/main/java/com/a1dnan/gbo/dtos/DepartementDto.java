package com.a1dnan.gbo.dtos;

import com.a1dnan.gbo.entities.Departement;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@Builder
public class DepartementDto {

    private Long id;
    private String nom;

    public static DepartementDto fromEntity(Departement departement){
        return DepartementDto.builder()
                .id(departement.getId())
                .nom(departement.getNom())
                .build();
    }

    public static Departement toEntity(DepartementDto departement){
        return Departement.builder()
                .id(departement.getId())
                .nom(departement.getNom())
                .build();
    }
}
