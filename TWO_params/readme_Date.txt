关于Date的格式，这个Module里面使用了两种：

共同环境：
1.两种格式可使用同一表单：
index.jsp中：   <%--日期Date的表单--%>

2.使用的类只有一个：domain包下 User类

3.当然，为了清楚还新建了测试方法：
  见 controller包下 ParamController.java中 @RequestMapping("/saveUser")方法


区别：
1.springmvc自带格式 不用多余的配置： xxxx/xx/xx

2.自定义格式： xxxx-xx-xx
  需自定义配置：

 步骤1：创建utils包下类 StringToDateConverter，写转换功能。
 步骤2：在springmvc.xml 中添加这个转换格式，自定义一个转换器。
        见     <!--配置自定义Date类型转换器-->  下内容。

 步骤三：重启服务器，网页检验。
