<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import= "com.sgic.dto.Employee,java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	List<Employee> employees = (List<Employee>)request.getAttribute("employee");
%>
<ul><%
	for(Employee emp : employees){
%>
	<li><%
	out.println(emp.getId());
	out.println(emp.getName());
	out.println(emp.getSalary());
	%>
	</li>
	<%
	}
	%>

	
</ul>
	

</body>
</html>