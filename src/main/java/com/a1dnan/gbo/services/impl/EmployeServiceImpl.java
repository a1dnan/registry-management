package com.a1dnan.gbo.services.impl;

import com.a1dnan.gbo.dtos.EmployeDto;
import com.a1dnan.gbo.dtos.ExpediteurDto;
import com.a1dnan.gbo.entities.Employe;
import com.a1dnan.gbo.repositories.EmployeRepository;
import com.a1dnan.gbo.services.EmployeService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class EmployeServiceImpl implements EmployeService {

    private final EmployeRepository employeRepository;

    @Override
    public EmployeDto addEmp(EmployeDto employeDto) {
        Employe emp = EmployeDto.toEntity(employeDto);
        Employe employe = employeRepository.save(emp);

        return EmployeDto.fromEntity(employe);
    }

    @Override
    public EmployeDto getEmp(Long id) {
        return employeRepository.findById(id).map(EmployeDto::fromEntity)
                .orElseThrow(() ->new EntityNotFoundException("No Employee was found"));
    }

    @Override
    public List<EmployeDto> findAll() {
        return employeRepository.findAll()
                .stream()
                .map(EmployeDto::fromEntity)
                .collect(Collectors.toList());
    }
}
