package com.lgcns.tct_backend.domain.restraunt.respoistory;

import com.lgcns.tct_backend.domain.restraunt.entity.RestaurantEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<RestaurantEntity, String> {
    
}
