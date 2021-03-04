<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%
    String contentPage = request.getParameter("contentPage");
    System.out.println("contentPage:"+contentPage);

    if(contentPage==null)
        contentPage="cmMain.jsp";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>

    <!-- mainForm.jsp  -->
    <meta charset="UTF-8">
    <title>RingRing! 맛있게 먹으면 0칼로리!</title>

</head>
<body>

<div id="wrap">
    <div id="header">
        <jsp:include page="header.jsp" />
    </div>

    <% if(contentPage.contains("myPage")) {%>
    <%@include file="sidebar.jsp"%>
    <%} %>

    <div id="main">
        <jsp:include page="<%=contentPage%>" />
    </div>
    <div id="footer">
        <jsp:include page="footer.jsp" />
    </div>
</div>

</body>
</html>


