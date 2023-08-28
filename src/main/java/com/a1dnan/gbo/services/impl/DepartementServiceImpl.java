package com.a1dnan.gbo.services.impl;

import com.a1dnan.gbo.dtos.CourrierDto;
import com.a1dnan.gbo.dtos.DepartementDto;
import com.a1dnan.gbo.entities.Courrier;
import com.a1dnan.gbo.entities.Departement;
import com.a1dnan.gbo.repositories.DepartementRepository;
import com.a1dnan.gbo.services.DepartementService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class DepartementServiceImpl implements DepartementService {

    private final DepartementRepository departementRepository;

    @Override
    public DepartementDto addDepartement(DepartementDto departementDto) {

        Departement dep = DepartementDto.toEntity(departementDto);
        Departement departement = departementRepository.save(dep);
        return DepartementDto.fromEntity(departement);
    }
    @Override
    public DepartementDto getDepartement(Long id) {
        return departementRepository.findById(id).map(DepartementDto::fromEntity)
                .orElseThrow(() ->new EntityNotFoundException("No Department was found"));
    }
    @Override
    public List<DepartementDto> findAll() {
        return departementRepository.findAll()
                .stream()
                .map(DepartementDto::fromEntity)
                .collect(Collectors.toList());
    }
}
