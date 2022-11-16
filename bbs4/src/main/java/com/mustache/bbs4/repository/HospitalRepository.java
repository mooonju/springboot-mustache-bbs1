package com.mustache.bbs4.repository;

import com.mustache.bbs4.domain.dto.HospitalDto;
import com.mustache.bbs4.domain.entity.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HospitalRepository extends JpaRepository<Hospital, Integer> {
    @Query("select new com.mustache.bbs.domain.dto.HospitalDto(h.id, h.hospitalName, h.roadNameAddress) " +
            "from Hospital h")
    List<HospitalDto> findAllByDTO();
}
