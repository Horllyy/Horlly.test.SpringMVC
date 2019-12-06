package My.controller;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/user")
public class UserController {

    /**
     * 传统方法
     * @param request
     * @return
     * @throws Exception
     */

    @RequestMapping("/fileupload")
    public String fileupload(HttpServletRequest request) throws Exception {
        System.out.println("文件上传。。。");
        //使用fileupload组件完成文件上传
        //1.指定文件上传位置
        String path=request.getSession().getServletContext().getRealPath("/uploads/");
        //判断该路径是否存在
        File file=new File(path);
        if(!file.exists()){
            file.mkdirs();
        }

        //解析request对象，获得上传文件项
        DiskFileItemFactory factory=new DiskFileItemFactory();
        ServletFileUpload upload=new ServletFileUpload(factory);

        //解析request
        List<FileItem> items=upload.parseRequest(request);
        //遍历
        for (FileItem item:items
             ) {
            //判断当前item对象是否是上传文件选项
            if (item.isFormField()){
                //说明是一个普通表单项
            }
            else {
                System.out.println("进入文件上传轨道...");
                //说明是上传文件项
                String filename=item.getName();
                //把文件名称唯一化
                String uuid=UUID.randomUUID().toString().replace("-","");
                filename=uuid+"_"+filename;
                item.write(new File(path,filename));
                //删除临时文件
                item.delete();
            }
        }
        return "succeed";
    }

    /**
     * springmvc方法
     *
     * @param request
     * @param upload
     * @return
     * @throws Exception
     */

    @RequestMapping("/fileupload2")
    public String fileupload2(HttpServletRequest request, MultipartFile upload) throws Exception {
        System.out.println("springmvc文件上传。。。");
        //使用fileupload组件完成文件上传
        //1.指定文件上传位置
        String path=request.getSession().getServletContext().getRealPath("/images/");
        //判断该路径是否存在
        File file=new File(path);
        if(!file.exists()){
            file.mkdirs();
        }

        System.out.println("进入文件上传轨道...");
        //说明是上传文件项
        String filename=upload.getOriginalFilename();
        //把文件名称唯一化
        String uuid=UUID.randomUUID().toString().replace("-","");
        filename=uuid+"_"+filename;
        upload.transferTo(new File(path,filename));

        return "succeed";
    }

    /**
     * pringmvc方法 跨服务器上传
     *
     * @param upload
     * @return
     * @throws Exception
     */

    @RequestMapping("/fileupload3")
    public String fileupload3(MultipartFile upload) throws Exception {
        System.out.println("跨服务器文件上传。。。");
        //定义上传服务器路径
        String path="http://localhost:8081/FIVE_fileuploadserver/uploads/";

        System.out.println("进入文件上传轨道...");
        //说明是上传文件项
        String filename=upload.getOriginalFilename();
        //把文件名称唯一化
        String uuid=UUID.randomUUID().toString().replace("-","");
        filename=uuid+"_"+filename;

        //创建客户端对象
        Client client= Client.create();
        //和图片服务器进行连接
       WebResource webResource= client.resource(path+filename);
       //完成文件上传，跨服务器
        System.out.println("进行跨服务器上传");
        webResource.put(upload.getBytes());

        return "succeed";
    }
}
