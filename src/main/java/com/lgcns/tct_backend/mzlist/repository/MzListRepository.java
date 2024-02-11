package com.lgcns.tct_backend.mzlist.repository;

import com.lgcns.tct_backend.mzlist.domain.MzList;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MzListRepository extends JpaRepository<MzList, Long> {
    List<MzList> findByUserId(String userId);

    Optional<MzList> findByUserIdAndMzListId(String userId, String mzListId);
}
