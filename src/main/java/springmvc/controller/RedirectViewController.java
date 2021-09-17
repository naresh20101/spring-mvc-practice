package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectViewController {
	@RequestMapping("/go")
	public RedirectView one()
	{
		RedirectView redirectView=new RedirectView();
		redirectView.setUrl("enjoy");
		return redirectView;
	}
	@RequestMapping("/enjoy")
	public String two()
	{
		
		 return "contact";
	}

}
