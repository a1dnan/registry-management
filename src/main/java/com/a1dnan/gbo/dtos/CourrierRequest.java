package com.a1dnan.gbo.dtos;

import com.a1dnan.gbo.entities.enums.TypeCourrier;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
public class CourrierRequest {

    private String objet;
    private TypeCourrier type;
    private Long idExp;
    private Long idDep;
}
