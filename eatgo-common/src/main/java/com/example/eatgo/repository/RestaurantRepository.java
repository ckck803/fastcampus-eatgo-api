package com.example.eatgo.repository;

import com.example.eatgo.domain.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
    List<Restaurant> findAllByAddressContaining(String region);
    List<Restaurant> findAllByAddressContainingAndCategoryId(String region, Long categoryId);
}
