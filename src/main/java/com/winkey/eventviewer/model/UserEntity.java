package com.winkey.eventviewer.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PostLoad;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;

/**
 * @author Venkatesh Rajendran
 */

@Data
@NoArgsConstructor
@Entity
@Table(name = "user_table")
public class UserEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id",nullable = false, unique = true)
    private Integer id;

    @Column(name="user_name", nullable = false, unique = true)
    private String username;

    @Column(name="first_name", nullable = false)
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="password_enc", nullable = false)
    private String passwordEnc;

    @Column(name = "location")
    private String location;

    @Column(name = "mobile_number")
    private String mobileNumber;

    @Transient
    private boolean isAdmin;

    @Enumerated(EnumType.STRING)
    @Column(name = "role")
    private UserRole role;

    @PostLoad
    public void postLoad(){
        isAdmin = role == UserRole.ADMIN;
    }

    @PrePersist
    @PreUpdate
    public void prePersist(){
        role = UserRole.ifAdmin(isAdmin);
    }
}
