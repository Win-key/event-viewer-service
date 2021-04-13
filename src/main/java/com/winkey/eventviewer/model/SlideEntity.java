package com.winkey.eventviewer.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Venkatesh Rajendran
 * @vendor (Ideas2IT)
 */

@Data
@NoArgsConstructor
@Entity
@Table(name = "slide_table")
public class SlideEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "slide_id",nullable = false, unique = true)
    private Integer id;

    @Column(name="image", nullable = false)
    private String image;

}
