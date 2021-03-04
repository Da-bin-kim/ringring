package com.dessert.ringring.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.dessert.ringring.domain.DTOMember;
@Mapper
public interface MemberMapper {
	
	//1.회원가입
	public int insertMember(DTOMember member);
	
	//2.회원 정보 수정
	public int updateMember(DTOMember member);
	
	//3.회원 정보 조회
	public DTOMember getMemberInfo(String id);
	
	//4.아이디 중복 확인
	public int overlapId(String id);
	
	//5.아이디 찾기
	public int findId(String name,String email);
	
	//6.비밀번호 찾기
	public DTOMember findPw(DTOMember member);
	
	//7.로그인
	public int login(DTOMember member);
	
	//8.비번 재설정
	public int pwReset(String id,String pw);
	
	//9.권한찾기
	List<String> readAuthority(String id);
	
	//10.활동가능여부
	public int updateAct(String id);
}
