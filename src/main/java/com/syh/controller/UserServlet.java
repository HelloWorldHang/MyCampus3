package com.syh.controller;

import com.syh.bean.GunTu;
import com.syh.bean.LiuYan;
import com.syh.bean.User;
import com.syh.service.GunTuService;
import com.syh.service.LiuYanService;
import com.syh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.PostConstruct;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@Controller
@MultipartConfig
@RequestMapping("/user")
public class UserServlet {
	@Autowired
	UserService userService;
	@Autowired
	LiuYanService liuYanService;
	@Autowired
	GunTuService gunTuService;

	@PostConstruct
	public void test() {
		System.out.println("yunhang test");
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@RequestParam String sno,@RequestParam String pwd,Model model,HttpSession session) {
		User user = userService.selectUserBySnoAndPassword(sno, pwd);
		
		if(user != null) {
			//更新滚图
			List<GunTu> gunTuList = gunTuService.selectAll();
			session.setAttribute("gunTuList", gunTuList);
			//user放到session中
			session.setAttribute("user", user);
			//更新动态
			List<LiuYan> liuYanList = liuYanService.selectAll();
			model.addAttribute("liuYanList", liuYanList);
			System.out.println(user.getUsername()+"登录了");
			return "main";
		}
		return "redirect:/login.jsp";
	}
	@RequestMapping(value = "/regist", method = RequestMethod.POST)
	public String regist(User user, Model model, HttpServletRequest req) throws IllegalStateException, IOException {
		//保存数据库的路径
		  String sqlPath = null; 
		  //定义文件保存的本地路径
		  String savePath = req.getServletContext().getRealPath("/");
		  savePath = savePath + "upload\\user";
		  String localPath=savePath;
	      //定义 文件名
	      String filename=null;  
	      if(!user.getFile().isEmpty()){  
	          //生成uuid作为文件名称  
	          String uuid = UUID.randomUUID().toString().replaceAll("-","");  
	          //获得文件类型（可以判断如果不是图片，禁止上传）  
	          String contentType=user.getFile().getContentType();  
	          //获得文件后缀名 
	          String suffixName=contentType.substring(contentType.indexOf("/")+1);
	          //得到 文件名
	          filename=uuid+"."+suffixName; 
	          //文件保存路径
	          user.getFile().transferTo(new File(localPath+File.separator+filename)); 
	          System.out.println(localPath+File.separator+filename);
	      }
	      //把图片的相对路径保存至数据库
	      sqlPath =filename;
	      user.setImg("upload\\user\\"+sqlPath);
	      
		int res = userService.insertUser(user);
		if(res == 1) {
			model.addAttribute("user", user);
			System.out.println(user.getUsername() + "注册成功");
			return "forward:/login.jsp"; 
		}
		return "redirect:/regist.jsp";
	}
	@RequestMapping(value="/personal",method = RequestMethod.GET)
	public String personal(String sno,Model model) {
		User personal = userService.selectUserBySno(sno);
		System.out.println(personal.getUsername()+"的主页被访问");
		model.addAttribute("personal", personal);
		List<LiuYan> liuYanList = liuYanService.selectBySno(sno);
		model.addAttribute("liuYanList", liuYanList);
		return "user/user_main";
	}
	@RequestMapping(value="/publish",method = RequestMethod.POST)
	public String publish(LiuYan liuYan, Model model, HttpSession session) {
		User user = (User) session.getAttribute("user");
		System.out.println(user.getUsername()+"发布了一条动态");
		liuYan.setSno(user.getSno());
		liuYanService.insert(liuYan);
		List<LiuYan> liuYanList = liuYanService.selectAll();
		model.addAttribute("liuYanList", liuYanList);
		return "main";
	}

}
