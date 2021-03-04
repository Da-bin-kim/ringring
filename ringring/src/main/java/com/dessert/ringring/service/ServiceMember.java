package com.dessert.ringring.service;

import java.io.UnsupportedEncodingException;

import javax.mail.MessagingException;
import javax.servlet.http.HttpServletRequest;

import com.dessert.ringring.domain.DTOMember;

public interface ServiceMember {
	
	//회원가입
	public void joinMember(HttpServletRequest req) throws MessagingException, UnsupportedEncodingException;
	
	//유저정보 읽어오기
	public DTOMember getUserInfo(String id);
	 
	//탈퇴
	public int deleteMember();
	 
	//회원정보 수정
	public int updateMember();
	
	//로그인
	public int login(HttpServletRequest req);
	 
	//아이디중복확인
	public int overLapId();
	 
	//이메일 중복 확인
	public int emailCheck();
	
	//이메일 인증
	public int verifyMember(String id);
	

	 

}
