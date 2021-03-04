<%@ page import="com.dessert.ringring.domain.DTOGoods" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
 <!DOCTYPE html>
 <html lang="en">
 <head>
  <% DTOGoods goods= (DTOGoods) session.getAttribute("goods"); %>
        <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <link rel="stylesheet" href="css/reset.css">
  <link rel="stylesheet" href="css/main.css">
  <link rel="stylesheet" href="css/product_section.css">
  <script src="http://code.jquery.com/jquery-1.10.1.js"></script>
  <script>
   $(document).ready(function () {
    $(".put_btn").click(function () {
     alert($(".put_btn").attr("text"));
    });
    $(".plus").on("click",(function(){
     var num = $(".numBox").val();
     var plusNum = Number(num) + 1;

     if(plusNum >= ${goods.stock}+1) {
      $(".numBox").val(num);
     } else {
      $(".numBox").val(plusNum);
     }
    }));
    $(".minus").click(function(){
     var num = $(".numBox").val();
     var minusNum = Number(num) - 1;

     if(minusNum <= 1) {
      $(".numBox").val(num);
     } else {
      $(".numBox").val(minusNum);
     }
    });
   });
  </script>

  <title>product_section</title>
 </head>
 <body>

 <div class="status"></div>
 <div id="product_section">
  <div class="section_inner">
   <div class="section_view">
    <img src="${goods.img}" alt="">
    <div class="view_p">
     <h2>${goods.name}</h2>
     <p class="view_name">${goods.shortDetail}</p>
     <p class="view_price">${goods.price}원</p>
     <div class="view_info">
      <dl class="v_list fst">
       <dt class="tit">판매단위</dt>
       <dd class="desc">${goods.weight}</dd>
      </dl>
      <dl class="v_list">
       <dt class="tit">배송구분</dt>
       <dd class="desc">택배배송</dd>
      </dl>
      <dl class="v_list">
       <dt class="tit">알레르기정보</dt>
       <dd class="desc">견과류 함유</dd>
      </dl>
     </div>
    </div>
    <div class="cartPut">
     <div class="total">
      <button type="button" class="minus"><i class="fa fa-minus-square-o"></i></button>
      <input type="number" value="1" class="numBox" readonly="readonly">
      <button type="button" class="plus"><i class="fa fa-plus-square-o"></i></button>
     </div>
     <div class="cart_btn">
      <button type="button" class="put_btn" text="장바구니에 상품이 담겼습니다.">장바구니 담기</button>
     </div>
    </div>
   </div>
   <div class="section_relation">
    <ul class="goods_information tt">
     <li class="goods_view" id="active">
      <a href="" class="goods_view_information">상품설명</a>
     </li>
     <li class="goods_view">
      <a href="" class="goods_view_information">상세정보</a>
     </li>
     <li class="goods_view">
      <a href="" class="goods_view_information">고객후기</a>
     </li>
     <li class="goods_view">
      <a href="" class="goods_view_information">상품문의</a>
     </li>
    </ul>
    <div class="goods_img"></div>
    <ul class="goods_information tt">
     <li class="goods_view">
      <a href="" class="goods_view_information">상품설명</a>
     </li>
     <li class="goods_view" id="active">
      <a href="" class="goods_view_information">상세정보</a>
     </li>
     <li class="goods_view">
      <a href="" class="goods_view_information">고객후기</a>
     </li>
     <li class="goods_view">
      <a href="" class="goods_view_information">상품문의</a>
     </li>
    </ul>
    <div class="goods_img"></div>
    <ul class="goods_information tt">
     <li class="goods_view">
      <a href="" class="goods_view_information">상품설명</a>
     </li>
     <li class="goods_view">
      <a href="" class="goods_view_information">상세정보</a>
     </li>
     <li class="goods_view" id="active">
      <a href="" class="goods_view_information">고객후기</a>
     </li>
     <li class="goods_view">
      <a href="" class="goods_view_information">상품문의</a>
     </li>
    </ul>
    <div class="goods_img"></div>
    <ul class="goods_information tt">
     <li class="goods_view">
      <a href="" class="goods_view_information">상품설명</a>
     </li>
     <li class="goods_view">
      <a href="" class="goods_view_information">상세정보</a>
     </li>
     <li class="goods_view">
      <a href="" class="goods_view_information">고객후기</a>
     </li>
     <li class="goods_view" id="active">
      <a href="" class="goods_view_information">상품문의</a>
     </li>
    </ul>
    <div class="goods_img"></div>
   </div>
  </div>
 </div>
 </body>
 </html>