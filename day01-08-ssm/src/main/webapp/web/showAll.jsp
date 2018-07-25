<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<style type="text/css">
  #msgTr0{
    color: red;
  }
  #msgTr1{
    color: blue;
  }
</style>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body style="font-size: 20px">
<div id="msgDiv" >
 <table>
   <tr>
     <td>部门ID</td>
     <td>部门名称</td>
     <td>部门地址</td>
   </tr>
   <c:forEach items="${depts}" var="u" varStatus="s">
   <tr id="msgTr${s.index%2}">
      <td>${u.id }</td>
      <td>${u.deptName}</td>
      <td>${u.deptLoc}</td>
   </tr>
   </c:forEach>
   
 </table>
 </div>

</body>
</html>