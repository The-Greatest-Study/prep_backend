package com.lgcns.tct_backend.mzlist.service;

import com.lgcns.tct_backend.mzlist.domain.MzlistEntity;
import com.lgcns.tct_backend.mzlist.domain.MzlistMapper;
import com.lgcns.tct_backend.mzlist.domain.UserMzlistRelEntity;
import com.lgcns.tct_backend.mzlist.domain.UserMzlistRelMapper;
import com.lgcns.tct_backend.mzlist.dto.MzlistDTO;
import com.lgcns.tct_backend.mzlist.dto.MzlistDetailRes;
import com.lgcns.tct_backend.mzlist.dto.UserMzlistRelDTO;
import com.lgcns.tct_backend.mzlist.repository.MzlistRepository;
import com.lgcns.tct_backend.mzlist.repository.UserMzlistRelRepository;
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

    public void createMzlist(MzlistDTO mzList){

        //1. UserId로 User정보가 있는 지 확인

        repository.save(mapper.toEntity(mzList));

        userMzlistRelRepository.save(userMzlistRelMapper.toEntity(UserMzlistRelDTO.from(mzList)));

    }


}
