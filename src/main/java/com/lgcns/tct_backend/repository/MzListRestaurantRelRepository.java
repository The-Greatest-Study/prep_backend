package com.lgcns.tct_backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lgcns.tct_backend.model.MzListRestaurantRel;

public interface MzListRestaurantRelRepository extends JpaRepository<MzListRestaurantRel, String>{
  
  List<MzListRestaurantRel> findByListId(String listId);

}
