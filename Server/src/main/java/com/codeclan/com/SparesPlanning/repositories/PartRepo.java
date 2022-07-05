package com.codeclan.com.SparesPlanning.repositories;

import com.codeclan.com.SparesPlanning.models.Part;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartRepo extends JpaRepository<Part, Long>{
}
