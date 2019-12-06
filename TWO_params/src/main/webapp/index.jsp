<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 2019/8/13
  Time: 16:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>This is Horlly's second SpringMVC web index page.</title>
</head>
<body>
  <h3>学习目标：请求参数绑定的应用</h3>

  <a href="param/testParam?username=hehe&password=123&date=new Date()">点击跳转</a>

  <%--<form action="accountController/saveAccount" method="post">--%>
      <%--姓名：<input type="text" name="username"/><br>--%>
      <%--密码：<input type="text" name="password"><br>--%>
      <%--金额：<input type="text" name="money"/><br>--%>
      <%--用户姓名：<input type="text" name="user.uname"/><br>--%>
      <%--用户年龄：<input type="text" name="user.age"><br>--%>
      <%--<br><br>--%>
      <%--list用户1姓名：<input type="text" name="list[0].uname"/><br>--%>
      <%--list用户1年龄：<input type="text" name="list[0].age"><br>--%>
      <%--<br>--%>
      <%--list用户2姓名：<input type="text" name="list[1].uname"/><br>--%>
      <%--list用户2年龄：<input type="text" name="list[1].age"><br>--%>
      <%--<br><br>--%>
      <%--map用户1姓名：<input type="text" name="map[one].uname"/><br>--%>
      <%--map用户1年龄：<input type="text" name="map[one].age"><br>--%>
      <%--<br>--%>
      <%--map用户2姓名：<input type="text" name="map['two'].uname"/><br>--%>
      <%--map用户2年龄：<input type="text" name="map['two'].age"><br>--%>
      <%--<input type="submit" value="提交"/>--%>
  <%--</form>--%>

  <%--&lt;%&ndash;日期Date的表单&ndash;%&gt;--%>
  <%--<form action="param/saveUser" method="post">--%>
      <%--用户姓名：<input type="text" name="uname"/><br>--%>
      <%--用户年龄：<input type="text" name="age"><br>--%>
      <%--用户日期：<input type="text" name="date"><br>--%>
      <%--<input type="submit" value="提交"/>--%>
  <%--</form>--%>

  <%--Servlet原生的API--%>
  <%--<a href="accountController/testServlet">点击跳转</a>--%>

   <%--requestBody的测试--%>
  <%--<form action="anno/testRequestBody" method="post">--%>
      <%--用户姓名：<input type="text" name="username"/><br>--%>
      <%--用户年龄：<input type="text" name="age"><br>--%>
      <%--<input type="submit" value="提交"/>--%>
  <%--</form>--%>

  <%--ModelAttribute的测试--%>
  <%--<form action="anno/testModelAttribute" method="post">--%>
      <%--用户姓名：<input type="text" name="username"/><br>--%>
      <%--用户年龄：<input type="text" name="age"><br>--%>
      <%--<input type="submit" value="提交"/>--%>
  <%--</form>--%>

   <%--<a href="anno/testSessionAttribute">测试ModelAttribute注释的超链接(单纯跳转 无参数)</a>--%>

  测试ModelAttibute的表单:
   <form action="anno/testSessionAttribute" method="post">
       <input type="text" name="color"/>
       <input type="text" name="brand"/>
       <input type="submit" value="提交"/>
   </form>

  <a href="anno/getSessionAttribute">get ModelAttribute注释的超链接</a>

  <a href="anno/deleteSessionAttribute">删除 ModelAttribute注释的超链接</a>

</body>
</html>
