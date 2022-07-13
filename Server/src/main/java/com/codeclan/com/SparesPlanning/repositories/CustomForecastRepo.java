package com.codeclan.com.SparesPlanning.repositories;

import com.codeclan.com.SparesPlanning.models.Forecast;

import java.util.List;

public interface CustomForecastRepo {
    List<Forecast> findForecastByCustomerAndUnitId(Long cid, Long uid);
}
