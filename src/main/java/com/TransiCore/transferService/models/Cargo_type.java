package com.TransiCore.transferService.models;
import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

import jakarta.persistence.OneToMany;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "cargo_types")
@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cargo_type {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @CreationTimestamp
    private LocalDateTime created_at;
     
    @UpdateTimestamp
    private LocalDateTime updated_at;

    @OneToMany(mappedBy = "cargo_type")
    private List<Cargo> cargos;

}
