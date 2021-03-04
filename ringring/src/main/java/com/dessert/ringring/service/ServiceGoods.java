package com.dessert.ringring.service;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.dessert.ringring.domain.DTOGoods;
import org.springframework.web.multipart.MultipartFile;

public interface ServiceGoods {
	public int insertGoods(HttpServletRequest req, MultipartFile files) throws IOException;

	public DTOGoods getInfoGoods(int idx);
	
	public List<DTOGoods> listGoods();
	
	public int deleteGoods(int idx);

    int updateGoods(HttpServletRequest req);

    public int selectBoardTotalCount();
}
