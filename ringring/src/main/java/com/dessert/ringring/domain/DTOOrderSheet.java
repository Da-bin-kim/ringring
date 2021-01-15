package com.dessert.ringring.domain;

import lombok.Data;

@Data
public class DTOOrderSheet {
	private int idx;
	private String toName;
	private String toAddress;
	private String toPhone;
	private String orderId;
	private int orderPhone;
	private String memo;
	private String orderNum;
	private int wayBill;


}
