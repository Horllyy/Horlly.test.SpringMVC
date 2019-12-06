<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 2019/8/12
  Time: 22:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false" %>
<html>
<head>
    <title>This is the secceed page!</title>
</head>
<body>
  <h3>你成功啦小宝贝！</h3>

  <h3>测试SessionAttribute注释的参数：</h3>

  <%--request中有贼多东西所以我才用.message标明--%>
  ${requestScope.message}

  <%--没model过的存不进来--%>
  ${requestScope.color}

  <%--session中只有我存进去的一些变量，东西少，所以我全部打印，直接写session就好不用特指--%>
  ${sessionScope}

</body>
</html>
