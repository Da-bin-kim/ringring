package com.dessert.ringring.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.dessert.ringring.domain.DTOGoods;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface GoodsMapper {

	int insertGoods(DTOGoods goods);

	DTOGoods getInfoGoods(int idx);

//	List<DTOGoods> listGoods(String category1,String category2);
	//parameterType 쿼리에서 사용될 매개변수의 타입 지정->#{java변수명}의 형식으로 쿼리에 넣어주면 됨
	//resultType 쿼리의 결과를 담을 자바 클래스 지정
	List<DTOGoods> listGoods();

	int deleteGoods(int idx);

	int updateGoods(DTOGoods goods);

	int selectBoardTotalCount();
}
