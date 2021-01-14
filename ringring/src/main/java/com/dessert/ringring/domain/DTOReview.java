package com.dessert.ringring.domain;

import java.util.Date;

import lombok.Data;

@Data
public class DTOReview {
	private int idx;
	private String id;
	private String title;
	private String content;
	private Date date;
	private String doAnswer;
	private String img;
	private String reContent;
	private Date reDate;
	private int productIdx;
	private String doSecret;

}
