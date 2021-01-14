package com.dessert.ringring.domain;

import java.util.Date;

import lombok.Data;

@Data
public class DTOBoard {
	private int idx;
	private String title;
	private Date date;
	private String content;
	private String img;
	private String boardType;

}
