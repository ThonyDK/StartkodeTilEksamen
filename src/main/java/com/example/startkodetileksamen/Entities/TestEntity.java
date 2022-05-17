package com.example.startkodetileksamen.Entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "TestEntity")
public class TestEntity {

    @Id
    private String firstName;
    private String lastName;
}
