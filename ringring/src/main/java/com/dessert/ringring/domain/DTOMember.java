package com.dessert.ringring.domain;

import java.util.Date;
import java.util.UUID;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class DTOMember {
	private int idx;
	
	@NotBlank(message = "이름은 필수 입력 값입니다")
	private String name;
	
	@NotBlank(message = "비밀번호는 필수 입력 값입니다")
	@Pattern(regexp="(?=.*[0-9])(?=.*[a-zA-Z])(?=.*\\W)(?=\\S+$).{8,20}",
			message = "비밀번호는 영문 대,소문자와 숫자, 특수기호가 적어도 1개 이상씩 포함된 8-20자의 비밀번호여야 합니다")
	private String password;
	
	@Size(min=4, max=10, message = "4글자 이상 10글자 미만입력해주세요")
	private String id;
	private int phone;
	private String address;
	private String email;
	private String article;
	private Date date;
	private String pin;
	private int point;
	private String authority;
	private String isEnable;
	
	public void generateEmailCheckToken() {
		this.pin=UUID.randomUUID().toString();
	}
	
//	private boolean isAccountNonExpired;
//	private boolean isAccountNonLocked;
//	private boolean isCredentialsNonExpried;
//	private boolean isEnabled;
//	private Collection <? extends GrantedAuthority>authorities;
//	
//	
//	//사용자 권한을 콜렉션 형태로 반환
//	//단 클래스 자료형은 GrantedAuthority 구현해야 함 
//	@Override
//	public Collection<? extends GrantedAuthority> getAuthorities() {
//		// TODO Auto-generated method stub
//		return this.authorities;
//	}
//	@Override
//	public String getPassword() {
//		// TODO Auto-generated method stub
//		return this.password;
//	}
//	@Override
//	public String getUsername() {
//		// TODO Auto-generated method stub
//		return this.id;
//	}
//	
//	//계정 만료 여부 반환
//	@Override
//	public boolean isAccountNonExpired() {
//		// TODO Auto-generated method stub
//		return true;
//	}
//	@Override
//	public boolean isAccountNonLocked() {
//		// TODO Auto-generated method stub
//		return true;
//	}
//	@Override
//	public boolean isCredentialsNonExpired() {
//		// TODO Auto-generated method stub
//		return true;
//	}
//	
//	//계정 사용 가능여부 반환, true일경우 사용 가능
//	@Override
//	public boolean isEnabled() {
//		// TODO Auto-generated method stub
//		return true;
//	}
	
}
