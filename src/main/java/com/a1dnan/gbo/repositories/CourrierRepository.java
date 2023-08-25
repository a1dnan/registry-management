package com.a1dnan.gbo.repositories;

import com.a1dnan.gbo.entities.Courrier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourrierRepository extends JpaRepository<Courrier, Long> {
}
