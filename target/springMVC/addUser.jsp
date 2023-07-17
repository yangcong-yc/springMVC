<%--
  Created by IntelliJ IDEA.
  User: yc177
  Date: 2023/6/5
  Time: 16:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>
        添加User
    </title>
</head>
<body>
<form action="/hello/add" method="post">
    <table>
        <tr>
            <td>编号:</td>
            <td>
                <input type="text" name="id">
            </td>
        </tr>
        <tr>
            <td>姓名:</td>
            <td>
                <input type="text" name="name">
            </td>
        </tr>
        <tr>
            <td>编号:</td>
            <td>
                <button type="submit" >提交</button>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
