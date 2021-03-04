package com.dessert.ringring.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.dessert.ringring.domain.DTOBoard;

@Mapper
public interface BoardMapper {
	
	public int insertBoard(DTOBoard board);
	public DTOBoard selectBoardDetail(int idx);
	public int updateBoard(DTOBoard board);
	public int deleteBoard(int idx);
	public List<DTOBoard> selectBoardList();
	public int selectBoardTotalCount();
	

}
