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
    Employee :
    id - ${employee.empID}
    firstName - ${employee.firstName}
    lastName - ${employee.lastName}
    department - ${employee.department.name}

    <g:each in="${0..100}"><br/></g:each>
    <div id="bottom">
        
    </div>
</pre>
</body>
</html>