<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%-- 
<h1> 
<%
    // response.sendRedirect("https://www.kluniversity.in");  <%-- used for redirect to url webpage --%>
%>
</h1>

<h1> 
    Current Time <%= java.util.Calendar.getInstance().getTime() %> <%-- used for getting time --%>
</h1>
--%>




<h1>
<%! 
    // Defining the sum method using a declaration tag('!')
    int sum(int a, int b) {
        return a + b;
    }
%>
<% 
    int x = 25;
    int y = 68;
    //out.println("Sum of two values = " + sum(x, y));
    
    <%= "sum= "+sum(x,y)%>
%>
</h1>
</body>
</html>