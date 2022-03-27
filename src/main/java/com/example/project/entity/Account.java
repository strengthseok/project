package com.example.project.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@Table(name="account")
public class Account {

    @Id
    @Column(name="user_id", nullable = false)
    private int userid;

    @Column(name="user_name", nullable = false)
    private String username;

    @Column(name="user_info")
    private String userinfo;

    @Column(name="create_date", nullable = false)
    private LocalDateTime datetime;

}
