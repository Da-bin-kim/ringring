//package com.dessert.ringring.security;
//
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//public class SecurityConfig extends WebSecurityConfigurerAdapter{
//	
////	@Override
////	protected void configure(HttpSecurity http) throws Exception {
////		http
////			.authorizeRequests()
////				.antMatchers("/", "/login","/service").permitAll()
////				.antMatchers("/admin").hasRole("ADMIN")//ROLE_가 붙어서 적용되므로 테이블에 ROLE_붙여서 저장 
////				.antMatchers("/user").hasRole("USER")
////				.antMatchers("/member").hasRole("MEMBER")
////				.anyRequest().authenticated()
////				.and()
////			.formLogin()//하위에 구현한 로그인폼 URL설정, 로그인폼의 아이디와 패스워드는 username,password로 맞춤
////				.loginPage("/login")//로그인이 수행될 경로
////				.loginProcessingUrl("/loginProcess")//로그인form의 action과 일치
////				.defaultSuccessUrl("/loginuccess")//성공시 이동경로
////				.failureUrl("/login?error=true")//인증 실패시 보멸 화면 url
////			 .permitAll()
////			 .and()
////			 .logout()
////			 .permitAll()
////			 .logoutUrl("/logout")
////			 .logoutSuccessUrl("/")
////			 .and()
////			 .exceptionHandling()
////			 .accessDeniedPage("/accessDenied_page");//권한 없는 대상의 접속 시도시
////		
////	}
////	@Bean
////	public PasswordEncoder passwordEncoder() {
////		return PasswordEncoderFactories.createDelegatingPasswordEncoder();
////	}
//
//}
