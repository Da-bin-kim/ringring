package com.dessert.ringring.domain;

import org.springframework.stereotype.Component;

import lombok.Data;
@Component
@Data
public class DTOGoods {
	private int idx;
	private String name;
	private int price;
	private int stock;
	private String img;
	private String shortDetail;
	private String detail;
	private String weight;
	private String category1;
	private String category2;
	

}
