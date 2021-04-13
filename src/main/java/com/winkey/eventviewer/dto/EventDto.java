package com.winkey.eventviewer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author Venkatesh Rajendran
 * @vendor (Ideas2IT)
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventDto {
    private String eventName;
    private String eventDesc;
    private String location;
    private Date eventDate;
}
