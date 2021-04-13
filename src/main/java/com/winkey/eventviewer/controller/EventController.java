package com.winkey.eventviewer.controller;

import com.winkey.eventviewer.dto.BaseResponse;
import com.winkey.eventviewer.dto.EventDto;
import com.winkey.eventviewer.model.EventEntity;
import com.winkey.eventviewer.service.EventService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Venkatesh Rajendran
 * @vendor (Ideas2IT)
 */

@RestController
public class EventController {

    @Autowired
    private EventService eventService;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping("/events")
    public ResponseEntity<BaseResponse> getEvents(){
        BaseResponse<List<EventDto>> response = eventService.getEvents();
        return response.asResponseEntity();
    }

    @PostMapping("/event")
    public ResponseEntity<BaseResponse> createEvent(@RequestBody EventDto eventEntity){
        BaseResponse<String> response = eventService.createEvent(modelMapper.map(eventEntity, EventEntity.class));
        return response.asResponseEntity();
    }

}
