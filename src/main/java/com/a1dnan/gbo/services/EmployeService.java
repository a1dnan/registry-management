package com.a1dnan.gbo.services;

import com.a1dnan.gbo.dtos.EmployeDto;

public interface EmployeService {

    EmployeDto addEmp(EmployeDto employeDto);
    EmployeDto getEmp(Long id);
}
