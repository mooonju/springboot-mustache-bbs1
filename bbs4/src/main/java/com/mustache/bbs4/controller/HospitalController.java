package com.mustache.bbs4.controller;

import com.mustache.bbs4.service.HospitalService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@RequestMapping("/hospitals")
@AllArgsConstructor
@Controller
public class HospitalController {
    private final HospitalService hospitalService;

    @GetMapping("")
    public String index(Model model) {
        model.addAttribute("hospitalList", hospitalService.findAllByDTO());
        return "hospitals/list";
    }
}
