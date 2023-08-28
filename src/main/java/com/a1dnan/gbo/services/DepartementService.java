package com.a1dnan.gbo.services;

import com.a1dnan.gbo.dtos.DepartementDto;
import com.a1dnan.gbo.entities.Departement;

import java.util.List;
import java.util.Optional;

public interface DepartementService {

    DepartementDto addDepartement(DepartementDto departementDto);
    DepartementDto getDepartement(Long id);

    List<DepartementDto> findAll();
}
