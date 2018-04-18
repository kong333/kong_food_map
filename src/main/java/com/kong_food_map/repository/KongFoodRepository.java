package com.kong_food_map.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kong_food_map.domain.KongFood;

public interface KongFoodRepository extends JpaRepository<KongFood, Integer>  {

}
