package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	@Autowired
	private UserService userService;
	@ModelAttribute
	public void showCommon(Model model) {
	
		model.addAttribute("Header", "LearnCode with Naresh");
		model.addAttribute("desc", "Home for programmer");
		
	}
	@RequestMapping("/contact")
	public String showForm(Model m)
	{ 
		m.addAttribute("Header", "LearnCode with Naresh");
		m.addAttribute("desc", "Home for programmer");
		return "contact";
	}
	@RequestMapping(path="/processform",method=RequestMethod.POST)
	public String proceesFrom(@ModelAttribute("user") User user,Model model) {
		System.out.println(user);
		
		
		this.userService.createUser(user);
		return"success";
	}

}
/*
@RequestMapping(path="/processform",method=RequestMethod.POST)
public String proceesFrom(@RequestParam("email") String email,@RequestParam("name") String name,@RequestParam("password") String password,Model model) {
	User user=new User();
	user.setEmail(email);
	user.setName(name);
	user.setPassword(password);
	System.out.println(user);
	model.addAttribute("email", email);
	model.addAttribute("name", name);
	model.addAttribute("password",password);
	model.addAttribute("user",user);
	return"success";
}*/
