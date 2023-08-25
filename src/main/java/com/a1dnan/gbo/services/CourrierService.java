package com.a1dnan.gbo.services;

import com.a1dnan.gbo.dtos.CourrierDto;
import com.a1dnan.gbo.entities.Courrier;
import com.a1dnan.gbo.entities.enums.TypeCourrier;

import java.util.Optional;

public interface CourrierService {
    CourrierDto getCourrier(Long id);
    CourrierDto add(CourrierDto courrierDto);
}
