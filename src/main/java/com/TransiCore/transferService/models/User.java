package com.TransiCore.transferService.models;


import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;

import org.hibernate.annotations.UpdateTimestamp;


import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import com.TransiCore.transferService.enums.*;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Table(name = "users")
@Builder
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private String last_name;
  private String father_name;
  private String mother_name;
  private String national_number;
  private String identity_link;
  private String driving_lic_link;
  @Enumerated(EnumType.STRING)
  private Status status;
  private double latitude;
  private double longitude;
  @CreationTimestamp
  private LocalDateTime created_at;
  @UpdateTimestamp
  private LocalDateTime updated_at;
  @OneToOne(mappedBy = "driver")
  private Truck truck;

  @ManyToOne
  @JoinColumn(name = "credit_way_id")
  private Bank credit_way;
  
  @OneToMany(mappedBy = "user")
  List<Order> orders;

  @OneToMany(mappedBy = "resiver")
  List<Order> resived_orders;

}
