<%@ page import="ru.job4j.userservlet.User" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Users</title>
</head>
<body>
<% List<User> users =  (List<User>) request.getAttribute("users");%>
<% if (users != null && users.size() > 0) {%>
<table cellpadding="1" cellspacing="1" border="1" >
    <tr align="center" style="font-weight: bold">
        <td>Id</td>
        <td>Name</td>
        <td>Login</td>
        <td>Email</td>
        <td>CreateDate</td>
        <td></td>
        <td></td>
    </tr>
    <% for (User user: users) {%>
    <tr>
        <td><%=user.getId()%></td>
        <td><%=user.getName()%></td>
        <td><%=user.getLogin()%></td>
        <td><%=user.getEmail()%></td>
        <td><%=user.getCreateDate()%></td>
        <td>
            <form action="<%=request.getContextPath()%>/edit">
                <input name='id' type='hidden' value="<%=user.getId()%>">
                <input type='submit' value='EDIT'>
            </form>
        </td>
        <td>
            <form action="<%=request.getContextPath()%>/delete" method="post" >
                <input name='id' type='hidden' value="<%=user.getId()%>">
                <input type='submit' value='DELETE'>
            </form>
        </td>
    </tr>
    <% } %>
</table>
<% } else {%>
<p>There's nothing here!</p>
<% } %>

<form action="<%=request.getContextPath()%>/create" >
    <input type="submit" value="CREATE">
</form>

</body>
</html>
