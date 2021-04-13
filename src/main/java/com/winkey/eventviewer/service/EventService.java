package com.winkey.eventviewer.service;

import com.winkey.eventviewer.dto.BaseResponse;
import com.winkey.eventviewer.dto.EventDto;
import com.winkey.eventviewer.model.EventEntity;
import com.winkey.eventviewer.repository.EventRepository;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Venkatesh Rajendran
 * @vendor (Ideas2IT)
 */

@Slf4j
@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private ModelMapper modelMapper;

    public BaseResponse<List<EventDto>> getEvents() {
        List<EventDto> eventDtos = new ArrayList<>();
        eventRepository.findAll().forEach(
                e->{
                    eventDtos.add(modelMapper.map(e,  EventDto.class));
                }
        );
        return new BaseResponse<>(HttpStatus.OK, eventDtos);
    }

    public BaseResponse<String> createEvent(EventEntity eventEntity) {
        try {
            eventRepository.save(eventEntity);
            return new BaseResponse<>(HttpStatus.OK, "Successfully created the event");
        }catch (Exception e){
            log.error("Failed to create event",e);
            return new BaseResponse<>(HttpStatus.EXPECTATION_FAILED, "Failed to create the event");
        }
    }
}
