package com.lgcns.tct_backend.mzlist.repository;

import com.lgcns.tct_backend.mzlist.domain.MzListEntity;
import com.lgcns.tct_backend.mzlist.domain.RestaurantEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface RestaurantRepository extends JpaRepository<RestaurantEntity, String> {
    
}
