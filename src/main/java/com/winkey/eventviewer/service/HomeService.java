package com.winkey.eventviewer.service;

import com.winkey.eventviewer.dto.BaseResponse;
import com.winkey.eventviewer.dto.HomeDto;
import com.winkey.eventviewer.model.AboutEntity;
import com.winkey.eventviewer.model.SlideEntity;
import com.winkey.eventviewer.repository.AboutRepository;
import com.winkey.eventviewer.repository.SlideRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

/**
 * @author Venkatesh Rajendran
 * @vendor (Ideas2IT)
 */

@Service
public class HomeService {

    @Autowired
    private SlideRepository slideRepository;
    @Autowired
    private AboutRepository aboutRepository;

    public BaseResponse<HomeDto> getData() {
        HomeDto homeDto = new HomeDto();
        homeDto.setAbout(aboutRepository.findAll().stream().limit(5).map(AboutEntity::getContent).collect(Collectors.toList()));
        homeDto.setSlides(slideRepository.findAll().stream().limit(5).map(SlideEntity::getImage).collect(Collectors.toList()));
        return new BaseResponse<>(HttpStatus.OK, homeDto);
    }
}
