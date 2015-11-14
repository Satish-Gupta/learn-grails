<%--
  Created by IntelliJ IDEA.
  User: satish
  Date: 11/12/15
  Time: 11:44 AM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <g:applyLayout name="main"/>
    <title></title>
</head>

<body>
<pre>
    <g:link controller="session" action="sayHello">
        say hello
    </g:link>
    <g:link controller="session" action="putEmployeeInSession">
        Put employee session
    </g:link>
    <g:link controller="session" action="getEmployeeFromSession">
        get the employee from session
    </g:link>
</pre>
</body>
</html>