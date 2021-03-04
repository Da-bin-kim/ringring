package com.dessert.ringring.db;

import com.dessert.ringring.domain.DTOGoods;
import com.dessert.ringring.mapper.GoodsMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.dessert.ringring.domain.DTOMember;
import com.dessert.ringring.mapper.MemberMapper;
import com.dessert.ringring.service.ServiceMember;

import java.util.List;

@SpringBootTest
public class DBConfig {
	@Autowired
	private ApplicationContext context;
	
	@Autowired
	private SqlSessionFactory sessionFactory;
	
	@Autowired
	private MemberMapper mapper;
	
	@Autowired
	private ServiceMember serviceMember;
	
	@Autowired
	private DTOMember member;

	@Autowired
	private DTOGoods goods;

	@Autowired
	private GoodsMapper goodsMapper;

	@Test
	public void testByApplicationContext() {
		try {
            System.out.println("=========================");
            System.out.println(context.getBean("sqlSessionFactory"));
            System.out.println("=========================");

        } catch (Exception e) {
            e.printStackTrace();
        }
		
	}
	
	  @Test
	    public void testBySqlSessionFactory() {
	        try {
	            System.out.println("=========================");
	            System.out.println(sessionFactory.toString());
	            System.out.println("=========================");

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
}
//	  @Test
//	  public void testUser() {
//		  member.setId("admin");
//		  member.setPassword("admin");
//		  member.setName("관리자");
//		  member.setAuthority("admin");
//		  
//		  int result=mapper.insertMember(member);
//		  
//		  System.out.println(result);
//		  
//	  }
	  
//	  @Test
//	  public void loginTest() {
//		  //로그인 테스트
//		 member.setId("admin");
//		 member.setPassword("admin");
//		 int result=mapper.login(member);
//		 
//		 System.out.println("결과는 "+result);
//	  }
//	  
//	  @Test
//	  public void getInfo() {
//		  member=mapper.getMemberInfo("admin");
//		 
//		  System.out.println(member.getId());
//	  }
	  @Test
	  public void email() {
		  int result =mapper.updateAct("satam_1@naver.com");
		  
		  System.out.println(result);
	  }

	  @Test
	public void listGoods(){
		List<DTOGoods> list=goodsMapper.listGoods();

		  System.out.println(list);
		  System.out.println(goodsMapper.selectBoardTotalCount());

	  }
	  
}

