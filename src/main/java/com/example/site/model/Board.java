package com.example.site.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //프로젝트에서 연결된 DB의 넘버링 전략을 따라간다.

    private int id;

    @Column(nullable=false, length=30, unique=true)
    private String username;

    @Column(nullable=false, length=100)
    private String password;

    @Column(nullable=false, length=50)
    private String email;


}
