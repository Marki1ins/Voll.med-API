package com.vollmed.api.module.patient.entity;

import java.sql.Date;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity(name = "patient")
public class PatientEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "name", nullable = false, length = 100)
    private String name;
    @Column(name = "document", nullable = false, length = 100)
    private String document;

    @Column(name = "email", nullable = false, length = 100)
    private String email;
    @Column(name = "phone", nullable = false, length = 100)
    private String phone;

    @Column(name = "address", nullable = false, length = 100)
    private String street;
    @Column(name = "number", nullable = false, length = 100)
    private String number;
    @Column(name = "complement", length = 100)
    private String complement;
    @Column(name = "city", nullable = false, length = 100)
    private String city;
    @Column(name = "state", nullable = false, length = 100)
    private String state;
    @Column(name = "zip_code", nullable = false, length = 100)
    private int zip_code;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false)
    private Date created_at;
    @Column(name = "updated_at")
    private Date updated_at;
    @Column(name = "deleted_at")
    private Date deleted_at;
}
