<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 2019/8/15
  Time: 9:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <h3>传统方式文件上传</h3>

  <form action="user/fileupload" method="post" enctype="multipart/form-data">
      选择文件：<input type="file" name="upload"/><br>
      <input type="submit" value="上传"/>
  </form>

  <h3>springmvc方式文件上传</h3>

  <form action="user/fileupload2" method="post" enctype="multipart/form-data">
      选择文件：<input type="file" name="upload"/><br>
      <input type="submit" value="上传"/>
  </form>

  <h3>跨服务器文件上传</h3>

  <form action="user/fileupload3" method="post" enctype="multipart/form-data">
      选择文件：<input type="file" name="upload"/><br>
      <input type="submit" value="上传"/>
  </form>
</body>
</html>
