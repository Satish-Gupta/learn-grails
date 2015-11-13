<%--
  Created by IntelliJ IDEA.
  User: satish
  Date: 11/12/15
  Time: 4:48 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    %{--<g:applyLayout name="main"/>--}%
    <title></title>
</head>

<body>
<pre>
    source action: ${sourceAction}
    flash message: ${flash.message}
    message : ${message}
    <g:link controller="flash" action="goodNight">
        say good Night
    </g:link>
</pre>
</body>
</html>