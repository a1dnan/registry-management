package com.a1dnan.gbo.services.impl;

import com.a1dnan.gbo.dtos.CourrierDto;
import com.a1dnan.gbo.entities.Courrier;
import com.a1dnan.gbo.entities.Employe;
import com.a1dnan.gbo.entities.Expediteur;
import com.a1dnan.gbo.repositories.CourrierRepository;
import com.a1dnan.gbo.repositories.EmployeRepository;
import com.a1dnan.gbo.repositories.ExpediteurRepository;
import com.a1dnan.gbo.services.CourrierService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class CourrierServiceImpl implements CourrierService {

    private final CourrierRepository courrierRepository;
    private final ExpediteurRepository expediteurRepository;
    private final EmployeRepository employeRepository;


    @Override
    public CourrierDto getCourrier(Long id) {

        return courrierRepository.findById(id).map(CourrierDto::fromEntity)
                .orElseThrow(() ->new EntityNotFoundException("No Courier was found"));
    }

    @Override
    public CourrierDto add(CourrierDto courrierDto) {


        Courrier courrier = CourrierDto.toEntity(courrierDto);
        courrier.setDate(LocalDate.now());
        Courrier courrierSaved = courrierRepository.save(courrier);
        // add courier to the sender
        Expediteur expediteur = expediteurRepository.findById(courrierDto.getExpediteurId()).get();
        expediteur.setCourrier(courrierSaved);
        expediteurRepository.save(expediteur);
        // add courier to the employeeg
        Employe employe = employeRepository.findById(courrierDto.getEmployeId()).get();
        employe.setCourrier(courrierSaved);
        employeRepository.save(employe);

        return CourrierDto.fromEntity(courrierSaved);
    }
}
