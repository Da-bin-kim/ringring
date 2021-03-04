package com.dessert.ringring.service;

import java.io.UnsupportedEncodingException;

import javax.mail.MessagingException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.dessert.ringring.config.MailHandler;
import com.dessert.ringring.config.TemKey;
import com.dessert.ringring.domain.DTOMember;
import com.dessert.ringring.mapper.MemberMapper;

@Service
public class ServiceMemberImpl implements ServiceMember{ 
//implements UserDetailsService{

//	@Autowired
//	MemberRepository members;
//	@Autowired
//	PasswordEncoder passwordEncoder;
	
	@Autowired
	private JavaMailSender mailSender;
	@Autowired
	MemberMapper mapper;
	@Autowired
	DTOMember member;
	
	//회원가입
	@Override
	public void joinMember(HttpServletRequest req) throws MessagingException, UnsupportedEncodingException {
		member.setId(req.getParameter("id"));
		member.setPassword(req.getParameter("password"));
		member.setAddress(req.getParameter("address"));
		member.setName((req.getParameter("name")));
		member.setEmail((req.getParameter("email")));
		
		int phone=Integer.parseInt(req.getParameter("phone"));
		member.setPhone(phone);
		
		if (req.getParameter("article") !=null) {
			member.setArticle(req.getParameter("article"));
		}
		String authkey=new TemKey().getKey(50,false);
		member.setPin(authkey);
		
		mapper.insertMember(member);
		
		MailHandler sendMail=new MailHandler(mailSender);
		
		String reEmail=req.getParameter("email").replaceAll("@", "");
		String rereEmail=reEmail.replaceAll(".","");
		
		sendMail.setSubject("[Ring Ring! Dessert!] 회원가입 이메일 인증");
		sendMail.setText(new StringBuffer().append("<h1>[이메일 인증]</h1>")
				.append("<br>")
				.append("<p>아래 링크를 클릭하시면 이메일 인증이 완료됩니다.</p>")
				.append("<br>")
				.append("<a href='http://localhost:9090/join/verify?id=")
				.append(member.getId())
				.append("&email=")
				.append(rereEmail)
				.append("&pin=")
				.append(authkey)
				.append("' target='_blenk'>이메일 인증 확인</a>")
				.toString());
		sendMail.setFrom("RingRing@Dessert.com", "admin");
		sendMail.setTo(member.getEmail());
		sendMail.send();
	}
		
	
	
	//유저정보 읽어오기
	@Override
	public DTOMember getUserInfo(String id) {
		// TODO Auto-generated method stub
		return mapper.getMemberInfo(id);
	}
	
	@Override
	public int login(HttpServletRequest req) {
		member.setId(req.getParameter("id"));
		member.setPassword(req.getParameter("password"));
		
		int result = mapper.login(member);
		
		return result;
	}
	
	@Override
	public int deleteMember() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int updateMember() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public int overLapId() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int emailCheck() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public int verifyMember(String id) {
		
		return mapper.updateAct(id);
	}
	

	
//			
//	@Override
//	public DTOMember loadUserByUsername(String username) throws UsernameNotFoundException {
//		
//		member = mapper.getMemberInfo(username);
//		member.setAuthorities(getAuthorities(username));
//		
//		UserDetails userDetails=new UserDetails() {
//
//			@Override
//			public Collection<? extends GrantedAuthority> getAuthorities() {
//				// TODO Auto-generated method stub
//				return member.getAuthorities();
//			}
//
//			@Override
//			public String getPassword() {
//				// TODO Auto-generated method stub
//				return member.getPassword();
//			}
//
//			@Override
//			public String getUsername() {
//				// TODO Auto-generated method stub
//				return member.getId();
//			}
//
//			@Override
//			public boolean isAccountNonExpired() {
//				// TODO Auto-generated method stub
//				return true;
//			}
//
//			@Override
//			public boolean isAccountNonLocked() {
//				// TODO Auto-generated method stub
//				return true;
//			}
//
//			@Override
//			public boolean isCredentialsNonExpired() {
//				// TODO Auto-generated method stub
//				return true;
//			}
//
//			@Override
//			public boolean isEnabled() {
//				// TODO Auto-generated method stub
//				return true;
//			}
//			
//		};
//		
//		
//		return member;
//	}
//
//	
//	public DTOMember save(DTOMember member) {
//		member.setPassword(passwordEncoder.encode(member.getPassword()));
//		member.setAccountNonExpired(true);
//		member.setAccountNonLocked(true);
//		member.setCredentialsNonExpried(true);
//		member.setEnabled(true);
//		return members.save(member);
//		
//	}
//	public Collection<GrantedAuthority> getAuthorities(String username) 
//	{ 
//		List<String> string_authorities = (List<String>) mapper.getMemberInfo(username);
//		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>(); 
//		for (String authority : string_authorities) 
//		{ 
//			authorities.add(new SimpleGrantedAuthority(authority)); 
//		} 
//		return authorities; 
//	}
//	}
}

