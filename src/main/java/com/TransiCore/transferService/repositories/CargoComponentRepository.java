package com.TransiCore.transferService.repositories;

import com.TransiCore.transferService.models.Cargo_Component;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CargoComponentRepository extends JpaRepository<Cargo_Component, Long> {
}

