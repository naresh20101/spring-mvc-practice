package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("/home")
	public String home(Model model)
	{
		System.out.println("this is home url");
		model.addAttribute("id",47);
		model.addAttribute("name", "Naresh Kumar");
		List<String> friends=new ArrayList<String>();
		friends.add("Turab Bajeer");
		friends.add("JK Khatri");
		friends.add("Ayoob Bhugti");
		model.addAttribute("f", friends);		
		return "index";
	}
	@RequestMapping("/help")
	public ModelAndView help() {
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("id",47);
		modelAndView.addObject("name", "Naresh Kumar");
		modelAndView.setViewName("help");
		return modelAndView;
		
	}

}
