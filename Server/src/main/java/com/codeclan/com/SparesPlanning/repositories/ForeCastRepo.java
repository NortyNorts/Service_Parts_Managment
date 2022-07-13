package com.codeclan.com.SparesPlanning.repositories;

import com.codeclan.com.SparesPlanning.models.Forecast;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ForeCastRepo extends JpaRepository<Forecast,Long> , CustomForecastRepo {
}
