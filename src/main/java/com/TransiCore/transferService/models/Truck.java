package com.TransiCore.transferService.models;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


import com.TransiCore.transferService.enums.Fuel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

import jakarta.persistence.OneToOne;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "trucks")
@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Truck {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String manufacturer;
    private String name;
    @Column(nullable = false,unique = true)
    private String board_number;
    @Column(nullable = false,unique = true)
    private String engine_number;
    @Column(nullable = false,unique = true)
    private String chassis_number;
    private Long max_w_load;
    private Long box_Long;
    private Long box_width;
    private Long box_height;
    @Column(nullable = false,unique = true)
    private String image_link;
    
    @CreationTimestamp
    private LocalDateTime created_at;

    @UpdateTimestamp
    private LocalDateTime updated_at;


    @Enumerated(EnumType.STRING)
    private Fuel fuel;
    
    private Double fuel_consum;         // استهلاك الوقود لكل كيلو متر
    private Double maintenance_cost_k; //تكلفة صيانة لكل كيلو متر
    private Double driver_coste_h;   //اجر السائق كل ساعة 
    private Double base_cost_k;    //تأمين    
    @OneToOne
    @JoinColumn(name = "driver_id")
    private User driver;

   
   
}
