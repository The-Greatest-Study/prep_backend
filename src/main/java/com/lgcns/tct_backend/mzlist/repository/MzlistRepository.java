package com.lgcns.tct_backend.mzlist.repository;

import com.lgcns.tct_backend.mzlist.domain.MzlistEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MzlistRepository extends JpaRepository<MzlistEntity, String> {
    List<MzlistEntity> findByUserId(String userId);

    Optional<MzlistEntity> findByUserIdAndMzlistId(String userId, String mzlistId);
}
