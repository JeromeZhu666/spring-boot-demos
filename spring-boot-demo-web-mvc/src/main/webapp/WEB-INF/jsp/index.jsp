<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<head><title>Hello World</title></head>
<body>
${message}<br/>
<%
out.println("Your IP address is " + request.getRemoteAddr());
%>
</body>
</html>