package com.a1dnan.gbo.services;

import com.a1dnan.gbo.dtos.CourrierDto;
import com.a1dnan.gbo.entities.enums.TypeCourrier;

import java.util.List;

public interface CourrierService {

    CourrierDto getCourrier(Long id);
    CourrierDto add(CourrierDto courrierDto);
    List<CourrierDto> findAll();

    List <CourrierDto> findCourrierByEmployeNom(String nom);
    List<CourrierDto> findAllCourrierByType(TypeCourrier type);
}
