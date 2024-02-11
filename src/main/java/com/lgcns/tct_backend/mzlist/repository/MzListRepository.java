package com.lgcns.tct_backend.mzlist.repository;

import com.lgcns.tct_backend.mzlist.domain.MzListEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MzListRepository extends JpaRepository<MzListEntity, String> {
    List<MzListEntity> findByUserId(String userId);

    Optional<MzListEntity> findByUserIdAndMzListId(String userId, String mzListId);
}
