<%--
  Created by IntelliJ IDEA.
  User: bumskim
  Date: 2017. 5. 28.
  Time: AM 10:39
  To change this template use File | Settings | File Templates.
  asdasd
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String head = (String)request.getAttribute("head");
    String leftBody = (String)request.getAttribute("leftBody");
    String centerBody = (String)request.getAttribute("centerBody");
    String rightBody = (String)request.getAttribute("rightBody");
    String bottom = (String)request.getAttribute("bottom");
%>
<html>
<head>
    <title>Welcome!</title>
</head>
<body>

<div id="all" align="center">
    <div id="head">
        <jsp:include page="<%= head%>" flush="false"/>
    </div>
    <div id="body">
        <span id="left-body"> <jsp:include page="<%= leftBody%>" flush="false"/> </span>
        <spqn id="center-body"> <jsp:include page="<%= centerBody%>" flush="false"/> </spqn>
        <span id="right-body"> <jsp:include page="<%= rightBody%>" flush="false"/> </span>
    </div>
    <div id="bottom">
        <jsp:include page="<%=bottom%>" flush="false"/>
    </div>
</div>


</body>
</html>
