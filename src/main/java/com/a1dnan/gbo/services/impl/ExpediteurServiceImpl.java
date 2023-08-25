package com.a1dnan.gbo.services.impl;

import com.a1dnan.gbo.dtos.ExpediteurDto;
import com.a1dnan.gbo.entities.Expediteur;
import com.a1dnan.gbo.repositories.ExpediteurRepository;
import com.a1dnan.gbo.services.ExpediteurService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ExpediteurServiceImpl implements ExpediteurService {

    private final ExpediteurRepository expediteurRepository;
    @Override
    public ExpediteurDto addExpediteur(ExpediteurDto expediteurDto) {

        Expediteur exp = ExpediteurDto.toEntity(expediteurDto);
        Expediteur expediteur = expediteurRepository.save(exp);

        return ExpediteurDto.fromEntity(expediteur);
    }

    @Override
    public ExpediteurDto getExp(Long id) {
        return expediteurRepository.findById(id).map(ExpediteurDto::fromEntity)
                .orElseThrow(() ->new EntityNotFoundException("No sender was found"));
    }
}
