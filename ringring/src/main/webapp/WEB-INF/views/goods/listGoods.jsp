<%@ page import="com.dessert.ringring.domain.DTOGoods" %>
<%@ page import="java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%ArrayList<DTOGoods> list= (ArrayList<DTOGoods>) session.getAttribute("list");%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="css/reset.css">
    <link rel="stylesheet" href="css/main.css">
    <link rel="stylesheet" href="css/product_list.css">
    <script>
        /* When the user clicks on the button,
        toggle between hiding and showing the dropdown content */
        function myFunction() {
            document.getElementById("myDropdown").classList.toggle("show");
        }

        // Close the dropdown if the user clicks outside of it
        window.onclick = function(event) {
            if (!event.target.matches('.dropbtn')) {
                var dropdowns = document.getElementsByClassName("dropdown-content");
                var i;
                for (i = 0; i < dropdowns.length; i++) {
                    var openDropdown = dropdowns[i];
                    if (openDropdown.classList.contains('show')) {
                        openDropdown.classList.remove('show');
                    }
                }
            }
        }
    </script>
    <title>RingRing</title>
</head>
<body>

<div class="status"></div>
<div id="product">
    <div id="product_inner">
        <h2>cookie</h2>
        <ul class="product_list tt">
            <li><a href="#">Vegan</a></li>
            <li><a href="#">Butter</a></li>
            <li><a href="#">Pet</a></li>
        </ul>
        <div class="dropdown">
            <button onclick="myFunction()" class="dropbtn">추천순 <i class="fa fa-chevron-down"></i></button>
            <div id="myDropdown" class="dropdown-content">
                <a href="#home">판매순</a>
                <a href="#about">가격 낮은순</a>
                <a href="#contact">가격 높은순</a>
            </div>
        </div>
        <ul class="product_img">
            <c:forEach var="list" items="${list}">
            <li>
                <a href="goodsDetail?idx=${list.idx}"><img src="${list.img}"></a>
                <h3 class="tt">${list.name}</h3>
                <p class="tt">${list.price} 원</p>
            </li>
            </c:forEach>
        </ul>
    </div>
</div>
</body>
</html>