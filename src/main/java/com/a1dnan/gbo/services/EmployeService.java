package com.a1dnan.gbo.services;

import com.a1dnan.gbo.dtos.EmployeDto;

import java.util.List;

public interface EmployeService {

    EmployeDto addEmp(EmployeDto employeDto);
    EmployeDto getEmp(Long id);

    List<EmployeDto> findAll();
}
