package com.syh.controller;

import com.syh.bean.LiuYan;
import com.syh.bean.User;
import com.syh.service.LiuYanService;
import com.syh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/liuyan")
public class LiuYanServlet {
	@Autowired 
	UserService userService;
	@Autowired
	LiuYanService liuYanService;
	@RequestMapping(value = "/like", method = RequestMethod.GET)
	public String like(Integer id,Model model,HttpSession session) {
		User user = (User) session.getAttribute("user");
		System.out.println(user.getUsername()+"赞了id为:"+id+"的动态");
		liuYanService.likeTheLiuYan(id, user.getSno());
		//修改完后再从数据库中调用一下
		List<LiuYan> liuYanList = liuYanService.selectAll();
		model.addAttribute("liuYanList", liuYanList);
		return "main";
	}
	
	@RequestMapping(value = "/comment", method = RequestMethod.GET)
	public String comment(Integer id,String comment,Model model,HttpSession session) {
		User user = (User) session.getAttribute("user");
		System.out.println(user.getUsername()+"评论了id为："+id+"的动态");
		liuYanService.commentTheLiuYan(id, comment, user.getSno());
		//修改完后再从数据库中调用一下
		List<LiuYan> liuYanList = liuYanService.selectAll();
		model.addAttribute("liuYanList", liuYanList);
		return "main";
	}
	@RequestMapping(value = "/column", method = RequestMethod.GET)
	public String column(Integer column,Model model) {
		List<LiuYan> liuYanList = liuYanService.selectByColumn(column);
		model.addAttribute("liuYanList", liuYanList);
		return "main";
	}
	@RequestMapping(value = "/liuyanMain", method = RequestMethod.GET)
	public String liuyanMain(Model model) {
		List<LiuYan> liuYanList = liuYanService.selectAll();
		model.addAttribute("liuYanList", liuYanList);
		return "main";
	}
}
