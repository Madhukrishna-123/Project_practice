package com.example.Project.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Project.entity.Project;

@Repository
public interface ProjectRepo  extends JpaRepository<Project, Long>{

}
