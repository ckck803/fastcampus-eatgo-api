package com.example.eatgo.service;

import com.example.eatgo.domain.Region;
import com.example.eatgo.repository.RegionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RegionService {

    private final RegionRepository regionRepository;
    public List<Region> getRegions() {
        return regionRepository.findAll();
    }
}
