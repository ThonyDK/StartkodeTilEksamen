package com.example.startkodetileksamen.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TestEntity")
public class TestEntity {

    @Id
    private String firstName;
    private String lastName;
}
