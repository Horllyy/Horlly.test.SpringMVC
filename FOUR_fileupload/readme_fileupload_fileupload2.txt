项目里面我写了两种方式：
 传统方法上传文件 springmvc方法上传文件

 这两种方法相互冲突，springmvc的方式更加强势，会影响传统方式的正常运行。

 即：不能同时启用两种方法，传统方法是不需要文件解析器的，springmvc方式需要在springmvc.xml中配置文件解析器，此举会抑制传统方法的正常运行，
 造成可以创建文件夹，却无法上传文件。

 所以，想运作传统方法时，要将springmvc方法禁用，起码注释掉springmvc.xml中的文件解析器配置。


 一个问题：

 每次重启服务器，相应程序生成的文件夹会覆盖前一次运行程序时生成的文件夹。（运行过程中多次上传不覆盖）

