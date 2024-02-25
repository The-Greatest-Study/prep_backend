package com.lgcns.tct_backend.domain.mzlist.service;

import com.lgcns.tct_backend.domain.mzlist.entity.MzlistEntity;
import com.lgcns.tct_backend.domain.mzlist.entity.MzlistMapper;
import com.lgcns.tct_backend.domain.restraunt.service.RestaurantService;
import com.lgcns.tct_backend.domain.user.entity.UserMzlistRelMapper;
import com.lgcns.tct_backend.domain.mzlist.dto.MzlistDTO;
import com.lgcns.tct_backend.domain.mzlist.dto.MzlistDetailRes;
import com.lgcns.tct_backend.domain.user.dto.UserMzlistRelDTO;
import com.lgcns.tct_backend.domain.mzlist.repository.MzlistRepository;
import com.lgcns.tct_backend.domain.user.repository.UserMzlistRelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@RequiredArgsConstructor
@Service
public class MzlistService {
    private final MzlistRepository repository;
    private final RestaurantService restaurantService;
    private final MzlistMapper mapper;

    private final UserMzlistRelRepository userMzlistRelRepository;
    private final UserMzlistRelMapper userMzlistRelMapper;

    public List<MzlistEntity> getMzlistByUser(String userId) {
        //1. 유효성 체크 필요

        return repository.findByUserId(userId);
    }

    public MzlistDetailRes getMzlistDetailByUser(String userId, String mzlistId) {

        MzlistDetailRes res = MzlistDetailRes.builder()
                .mzlistId(mzlistId)
                .build();

        MzlistEntity mzList = repository.findByUserIdAndMzlistId(userId, mzlistId)
                .orElseThrow(() -> new RuntimeException("Mzlist not found"));

        if (mzList.restaurants() != null) {
            mzList.restaurants().stream()
                    .map(e -> restaurantService.getRestaurantInfoById(e.restaurantId()))
                    .forEach(res::addRestaurant);
        }

        return res;
    }

    public void createMzlist(MzlistDTO mzlist){

        //1. UserId로 User정보가 있는 지 확인

        repository.save(mapper.toEntity(mzlist));

        userMzlistRelRepository.save(userMzlistRelMapper.toEntity(UserMzlistRelDTO.from(mzlist)));

    }


}
