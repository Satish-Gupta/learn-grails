<%--
  Created by IntelliJ IDEA.
  User: satish
  Date: 11/14/15
  Time: 4:22 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
</head>

<body>
<pre>
    <g:link controller="application" action="setMessageInServletContext">
        set message in application scope
    </g:link>
    <g:link controller="application" action="getMessageInApplicationScope">
        get message in application scope
    </g:link>
    <g:link controller="application" action="removeMessageInApplicationScope">
        get message in application scope
    </g:link>
</pre>
</body>
</html>