package com.mustache.bbs4.service;

import com.mustache.bbs4.domain.dto.HospitalDto;
import com.mustache.bbs4.repository.HospitalRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class HospitalService {
    private final HospitalRepository hospitalRepository;

    public List<HospitalDto> findAllByDTO() {
        return hospitalRepository.findAllByDTO();
    }
}
