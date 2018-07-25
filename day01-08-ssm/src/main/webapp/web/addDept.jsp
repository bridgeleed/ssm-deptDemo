<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body style="font-size: 20px">

 <form action="${pageContext.request.contextPath}/dept/addDept.do" method="post">
   部门：<input name="deptName"><br>
   地址：<input name="deptLoc"><br>
   <input type="submit" value="添加">
   
   </form>

</body>
</html>