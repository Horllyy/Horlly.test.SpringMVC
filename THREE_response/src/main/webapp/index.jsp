<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 2019/8/14
  Time: 15:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>This is the third springmvc module!</title>
</head>
<body>
  <h5> 一个开始的提示...</h5>

  <a href="user/testForwardOrRedirect">请求转发重定向测试</a>

  <script src="js/jquery.min.js"></script>

  <script>
      $(function () {
         $("#btn").click(function () {
            // alert("hello btn");
             //发送ajax请求
             $.ajax({
                 url:"user/testAjax",
                 contentType:"application/json;charset=UTF-8",
                 data:'{"username":"哈哈", "password":"123","age":"22" }',
                 dataType:"json",
                 type:"post",
                 success:function (data) {
                     //data 服务器端响应的json的数据，进行解析
                     alert(data);
                     alert(data.uname);
                     alert(data.password);
                     alert(data.age);
                 }
             });
         });
      });
  </script>

<button id="btn">发送ajax的请求</button>
</body>
</html>
