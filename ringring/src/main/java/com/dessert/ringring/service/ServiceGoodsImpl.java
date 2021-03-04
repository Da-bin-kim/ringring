package com.dessert.ringring.service;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.dessert.ringring.config.UploadFileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dessert.ringring.domain.DTOGoods;
import com.dessert.ringring.mapper.GoodsMapper;
import org.springframework.util.ResourceUtils;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ServiceGoodsImpl implements ServiceGoods {
	@Autowired
	GoodsMapper mapper;
	@Autowired
	DTOGoods goods;

	@Override
	public int insertGoods(HttpServletRequest req, MultipartFile file) throws IOException {
		
		goods.setName(req.getParameter("name"));
		int price = Integer.parseInt(req.getParameter("price"));	
		goods.setPrice(price);
		goods.setCategory1(req.getParameter("category1"));
		goods.setCategory2(req.getParameter("category2"));
		goods.setDetail(req.getParameter("detail"));
		goods.setShortDetail(req.getParameter("shortDetail"));
		int stock=Integer.parseInt(req.getParameter("stock"));
		goods.setStock(stock);
		goods.setWeight(req.getParameter("weight"));

		//이미지 업로드------------------------------------------------------
		//업로드 경로 설정
		String uploadPath = ResourceUtils.getFile("classpath:static/upload/").toPath().toString();
		uploadPath = uploadPath.replace("\\","/");
		uploadPath=uploadPath.replace("/bin/main/static","/src/main/resource/static");
		String ymdPath = UploadFileUtils.calcPath(uploadPath);
		String filesName=null;

		filesName = UploadFileUtils.fileUpload(uploadPath, file.getOriginalFilename(), file.getBytes(),ymdPath);
		String img=(File.separator+"upload"+ymdPath+File.separator+filesName);
		img=img.replace("\\","/");
		String imgS=(File.separator+ "upload" + ymdPath + File.separator + "s" + File.separator + "s_" + filesName);
		imgS.replace("\\","/");
		goods.setImg(img);
//
//
//		//input에 파일이 업로드되어 있다면,
//		if(file.getOriginalFilename() != null&& file.getOriginalFilename().equals("")){
//			filesName = UploadFileUtils.fileUpload(uploadPath, file.getOriginalFilename(), file.getBytes(),ymdPath);
//			String img=(File.separator+"upload"+ymdPath+File.separator+filesName);
//			img=img.replace("\\","/");
//			String imgS=(File.separator+ "upload" + ymdPath + File.separator + "s" + File.separator + "s_" + filesName);
//			imgS.replace("\\","/");
//			goods.setImg(img);
//		} else {  // 첨부된 파일이 없으면
//			filesName = File.separator + "upload" + File.separator + "none.jpg";
//			// 미리 준비된 none.png파일을 대신 출력함
//
//			goods.setImg(filesName);
//		}
		System.out.println("fileName : "+filesName);



		return mapper.insertGoods(goods);
	}

	@Override
	public DTOGoods getInfoGoods(int idx) {

		return mapper.getInfoGoods(idx);
	}

	@Override
	public List<DTOGoods> listGoods() {
		List<DTOGoods> goodsList= Collections.emptyList();
		int boardTotalCount = mapper.selectBoardTotalCount();
		if(boardTotalCount>0){
			goodsList=mapper.listGoods();
		}
		return goodsList;
	}

	@Override
	public int deleteGoods(int idx) {
		return mapper.deleteGoods(idx);
	}

	@Override
	public int updateGoods(HttpServletRequest req) {
		goods.setName(req.getParameter("name"));
		goods.setCategory1(req.getParameter("category1"));
		goods.setCategory1(req.getParameter("category2"));
		goods.setDetail(req.getParameter("detail"));
		int price=Integer.parseInt(req.getParameter("price"));
		goods.setPrice(price);
		goods.setShortDetail(req.getParameter("shortDetail"));
		goods.setWeight(req.getParameter("weight"));


		return mapper.updateGoods(goods);
	}

	@Override
	public int selectBoardTotalCount() {
		// TODO Auto-generated method stub
		return 0;
	}

}
