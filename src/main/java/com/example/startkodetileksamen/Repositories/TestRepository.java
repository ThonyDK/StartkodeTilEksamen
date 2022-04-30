package com.example.startkodetileksamen.Repositories;

import com.example.startkodetileksamen.Entities.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<TestEntity, String> {
}
