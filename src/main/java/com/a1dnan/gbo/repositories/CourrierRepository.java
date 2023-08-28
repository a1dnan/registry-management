package com.a1dnan.gbo.repositories;

import com.a1dnan.gbo.dtos.CourrierDto;
import com.a1dnan.gbo.entities.Courrier;
import com.a1dnan.gbo.entities.enums.TypeCourrier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourrierRepository extends JpaRepository<Courrier, Long> {

    List<CourrierDto> findAllCourrierByEmployeNomContains(String nom);

    List<CourrierDto> findAllCourrierByType(TypeCourrier type);

}
