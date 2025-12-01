package com.TransiCore.transferService.repositories;

import com.TransiCore.transferService.models.Tranfer_Details;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransferDetailsRepository extends JpaRepository<Tranfer_Details, Long> {
}

