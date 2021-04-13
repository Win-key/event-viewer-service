package com.winkey.eventviewer.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

/**
 * @author Venkatesh Rajendran
 * @vendor (Ideas2IT)
 */

@Data
@NoArgsConstructor
@Entity
@Table(name = "event_table")
public class EventEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "event_id",nullable = false, unique = true)
    private Integer id;

    @Column(name="event_name", nullable = false)
    private String eventName;

    @Column(name="event_desc", nullable = false)
    private String eventDesc;

    @Column(name="location", nullable = false)
    private String location;

    @Temporal(TemporalType.DATE)
    @Column(name="event_date", nullable = false)
    private Date eventDate;

}
