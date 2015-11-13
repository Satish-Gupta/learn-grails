<%--
  Created by IntelliJ IDEA.
  User: satish
  Date: 11/12/15
  Time: 4:43 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    %{--<g:applyLayout name="main"/>--}%
    <title></title>
</head>

<body>
source action: ${sourceAction}
<br/>
    ${flash.message}
    <br/>
    <g:link controller="flash" action="helloAgain">
        say hello again
    </g:link>
</body>
</html>