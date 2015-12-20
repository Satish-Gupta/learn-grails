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
    <g:link controller="employee" action="employeeDetails">employee Details</g:link>
    <br/>
    <g:link controller="employee" action="showEmployee">return new ModelAndView("/employeeDetails", [ employee : employee ])
    </g:link>
    <br/>
    <g:link controller="employee" action="displayEmployee">render view: "/employeeDetails",model: [ employee : employee ]
    </g:link>
</pre>
</body>
</html>