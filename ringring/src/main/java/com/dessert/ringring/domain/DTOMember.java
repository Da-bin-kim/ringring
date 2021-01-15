package com.dessert.ringring.domain;

import java.util.Date;

import lombok.Data;

@Data
public class DTOMember {
	private int idx;
	private String name;
	private String pw;
	private String id;
	private int phone;
	private String address;
	private String email;
	private String article;
	private Date date;
	private String isLeave;
	private String pin;
	private int point;
	
}
