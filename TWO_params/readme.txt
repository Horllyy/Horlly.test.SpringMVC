总结踩过的坑：

1.param.jsp  ->  index.jsp
  他妈的 我就感觉这个params.jsp没那么简单。明明从springmvc.xml中识别到controller以后也没有哪里和这个文件扯上关系。怎么就能自动定位到param.jsp了？？
  我闭上眼大胆猜测了一下，既然我没有写联系，那么肯定存在默认情况。所以我把param.jsp重命名为index.jsp。
  成功了。
  日噢，肯定是因为我在springmvc中写了这句：
      <mvc:annotation-driven></mvc:annotation-driven>
  所以默认自动设置了两个什么启动器啥的（名字忘记了但有两个，和视图解析器功能有异的别的组件）。在这里面肯定就有设置跳转界面了。