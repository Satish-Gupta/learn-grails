<%--
  Created by IntelliJ IDEA.
  User: satish
  Date: 11/12/15
  Time: 11:44 AM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    %{--<g:applyLayout name="main"/>--}%
    <title></title>
</head>

<body>
    <g:link controller="flash" action="sayHello">
        say hello
    </g:link>
    <br/>
    <g:link controller="flash" action="flashWithRender">
        Flash With Render
    </g:link>
</body>
</html>