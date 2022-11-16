package com.mustache.bbs4.domain.dto;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class HospitalDto {
    private Integer id;
    private String hospitalName;
    private String roadNameAddress;

    public HospitalDto(Integer id, String hospitalName, String roadNameAddress) {
        this.id = id;
        this.hospitalName = hospitalName;
        this.roadNameAddress = roadNameAddress;
    }
}
