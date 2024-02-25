package com.lgcns.tct_backend.mzlist.repository;

import com.lgcns.tct_backend.mzlist.domain.MzlistEntity;
import com.lgcns.tct_backend.mzlist.domain.UserMzlistRelEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserMzlistRelRepository extends JpaRepository<UserMzlistRelEntity, String> {

}
