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
@Table(name = "about_table")
public class AboutEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "about_id",nullable = false, unique = true)
    private Integer id;

    @Column(name="content", nullable = false)
    private String content;

}
