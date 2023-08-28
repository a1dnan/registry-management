package com.a1dnan.gbo.services;


import com.a1dnan.gbo.dtos.ExpediteurDto;

import java.util.List;


public interface ExpediteurService {

    ExpediteurDto addExpediteur(ExpediteurDto expediteurDto);
    ExpediteurDto getExp(Long id);
    List<ExpediteurDto> findAll();
}
