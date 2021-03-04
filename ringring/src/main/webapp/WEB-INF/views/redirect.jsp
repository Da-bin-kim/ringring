<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="true" %>
<html>
<head>
    <title>알림창</title>
</head>
<body>
<script>
    alert('${msg}');             //http : //localhost:8081/프로젝트이름/  
    location.href='<c:out value="${pageContext.request.contextPath}"/>${url}';
</script>
</body>
</html>