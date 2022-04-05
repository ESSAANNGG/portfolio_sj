package com.sjport.portfolio_sj.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Item extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long itemNo;

    @Column(length = 255, nullable = false)
    private String itemName;

    @Column(length = 500)
    private String itemExplain;

    @Column
    private int itemPrice;

    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long itemStock;

}
