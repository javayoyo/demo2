package com.example.demo2.entity;

import javax.persistence.*;

@Entity
//Entity 조건 > pk 컬럼이 반드시 1개 있어야 함!
@Table(name = "nation_table") // table 이름 지정
public class NationEntity {
    @Id // pk 컬럼 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment 적용
    private Long id;

    // colum 추가
    @Column(length = 50, nullable = false, unique = true)
//    nullable = false == not null
    private String nationName;
//    string varchar 기본 length = 255

    @Column
    private int population;

}
