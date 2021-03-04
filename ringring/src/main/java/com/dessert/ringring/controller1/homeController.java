package com.dessert.ringring.controller1;

import javax.servlet.http.HttpServletRequest;

import com.dessert.ringring.domain.DTOGoods;
import com.dessert.ringring.service.ServiceGoods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class homeController {
	@Autowired
	ServiceGoods goods;

	 @GetMapping("/")
	 public String main() {

	 	return "redirect:mainForm";
	 }
	 
	 @GetMapping("/mainForm")
	 public String MainForm( HttpServletRequest req ) {
	 	System.out.println( "msg:" + req.getParameter("msg"));
	 	req.getSession().setAttribute("msg", req.getParameter("msg"));


	 	return "mainForm"; //mainForm.jsp 호출
		    }

//	 @GetMapping("/productList")
//	 public String InsertProduct(HttpServletRequest req, RedirectAttributes redirect){
//	 	String category1 = req.getParameter("category1");
//	 	String category2 = req.getParameter("category2");
//
//	 	List<DTOGoods> goodsList=goods.listGoods(category1,category2);
//		 req.getSession().setAttribute("list",goodsList);
//
//		 redirect.addAttribute("contentPage","product/productList");
//		 return "redirect:mainForm";
//	 }
}
