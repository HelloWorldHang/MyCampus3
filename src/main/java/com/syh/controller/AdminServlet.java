package com.syh.controller;

import com.syh.bean.GunTu;
import com.syh.service.GunTuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@Controller
@MultipartConfig
@RequestMapping("/admin")
public class AdminServlet {
	@Autowired
	GunTuService gunTuService;
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(String admin,String pwd,Model model,HttpSession session) {
		if(admin.equals("admin") && pwd.equals("123")) {
			session.setAttribute("admin", admin);
			List<GunTu> gunTuList = gunTuService.selectAll();
			model.addAttribute("gunTuList", gunTuList);
			return "admin/guntu";
		}
		return "redirect:/adminlogin.jsp";
	}
	@RequestMapping(value = "/addGunTu", method = RequestMethod.POST)
	public String addGunTu(GunTu gunTu, Model model, HttpServletRequest req, HttpSession session) throws IllegalStateException, IOException {
		if(session.getAttribute("admin") == null)
			return "redirect:/adminlogin.jsp";
		uploadImg(gunTu, req);
		gunTuService.insert(gunTu);
		List<GunTu> gunTuList = gunTuService.selectAll();
		model.addAttribute("gunTuList", gunTuList);
		return "admin/guntu";
	}
	
	@RequestMapping(value = "/selectGunTuById", method = RequestMethod.GET)
	public String selectGunTuById(Integer id,Model model,HttpSession session) {
		GunTu gunTu = gunTuService.selectById(id);
		model.addAttribute("gunTu", gunTu);
		return "admin/updateguntu";
	}
	@RequestMapping(value = "/updateGunTu", method = RequestMethod.POST)
	public String updateGunTu(GunTu gunTu, Model model, HttpSession session, HttpServletRequest req) {
		if(!gunTu.getFile().isEmpty()) {
			System.out.println("uploadimg");
				try {
				uploadImg(gunTu, req);
			} catch (IOException e) {
				System.out.println("上传图片函数错误");
				e.printStackTrace();
			}
		}
		gunTuService.update(gunTu);
		List<GunTu> gunTuList = gunTuService.selectAll();
		model.addAttribute("gunTuList", gunTuList);
		return "admin/guntu";
	}
	@RequestMapping(value = "/deleteGunTu", method = RequestMethod.GET)
	public String deleteGunTu(Integer id,Model model,HttpSession session) {
		int res = gunTuService.delete(id);
		System.out.println(res);
		List<GunTu> gunTuList = gunTuService.selectAll();
		model.addAttribute("gunTuList", gunTuList);
		return "admin/guntu";
	}
	
	private void uploadImg(GunTu gunTu, HttpServletRequest req) throws IOException {
		//保存数据库的路径
		  String sqlPath = null; 
		  //定义文件保存的本地路径
		  String savePath = req.getServletContext().getRealPath("/");
		  savePath = savePath + "upload\\guntu";
		  String localPath=savePath;
	      //定义 文件名
	      String filename=null;  
	      if(!gunTu.getFile().isEmpty()){  
	          //生成uuid作为文件名称  
	          String uuid = UUID.randomUUID().toString().replaceAll("-","");  
	          //获得文件类型（可以判断如果不是图片，禁止上传）  
	          String contentType=gunTu.getFile().getContentType();  
	          //获得文件后缀名 
	          String suffixName=contentType.substring(contentType.indexOf("/")+1);
	          //得到 文件名
	          filename=uuid+"."+suffixName; 
	          //文件保存路径
	          gunTu.getFile().transferTo(new File(localPath+File.separator+filename)); 
	          System.out.println(localPath+File.separator+filename);
	      }
	      //把图片的相对路径保存至数据库
	      sqlPath =filename;
	      gunTu.setImg("upload\\guntu\\"+sqlPath);
	}
}
