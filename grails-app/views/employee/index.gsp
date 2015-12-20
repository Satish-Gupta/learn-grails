<%--
  Created by IntelliJ IDEA.
  User: satish
  Date: 12/14/15
  Time: 9:58 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
</head>

<body>
<pre>
    <g:link controller="employee" action="renderText">render Text</g:link>
    <br/>
    <g:link controller="employee" action="renderXML">render XML
    </g:link>
    <br/>
    <g:link controller="employee" action="renderViewWithModel">render View With Model
    </g:link>
    <g:link controller="employee" action="renderViewWithCollection">render View With Collection
    </g:link>
    <g:link controller="employee" action="renderViewWithBean">render View With Bean
    </g:link>
    <g:link controller="employee" action="renderMarkup">render Markup
    </g:link>
    <g:link controller="employee" action="renderXML1">render XML
    </g:link>
    <g:link controller="employee" action="renderJSON">render JSON
    </g:link>
    <g:link controller="employee" action="getEmployeeAsJSON">render employee as JSON
    </g:link>
    <g:link controller="employee" action="renderFile">render file
    </g:link>
</pre>
</body>
</html>