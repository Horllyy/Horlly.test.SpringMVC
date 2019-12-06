功能很简单： 在网页上script里定义一个Ajax对象，经springmvc处理输出json对象。

有以下几项步骤：

1.导入jquery.min.js插件

2.定义一个按钮，使用script语言关联方法，顺便在方法体内创建ajax对象，再顺便配置相关项。

3.springmvc.xml中导入json相关包：
            <artifactId>jackson-annotations</artifactId>

            <artifactId>jackson-databind</artifactId>

            <artifactId>jackson-core</artifactId>

4.在UserController中编写 testAjax 方法，将ajax转换成json对象（当然 不是直接ajax对象转换成json对象，过程中还涉及字符串的转化，
    辅之这两个方法体标签完成 RequestBody，ResponseBody）
    发送时：客户端发送ajax的请求，传的是json字符串，后端把json字符串封装到user对象中 只要参数名字都一样

5.最后，为了插件功能不被拦截，别忘记 springmvc.xml中的配置噢：
         <!--前端控制器，哪些静态资源不拦截-->
           <mvc:resources location="/js/" mapping="/js/**"/>

6.server的配置别忘记

PS：
ajax，json，script，这些语言我该多去了解一下，最好能编写简单的小程序。