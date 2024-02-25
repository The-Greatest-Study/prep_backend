package com.lgcns.tct_backend.mzlist.repository;

import com.lgcns.tct_backend.mzlist.domain.RestaurantEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<RestaurantEntity, String> {
    
}
