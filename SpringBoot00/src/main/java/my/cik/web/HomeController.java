package my.cik.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@ResponseBody
	@RequestMapping("/home")
	public String home() {
		System.out.println("Console=> Hello Boot~! 안녕?");
		return "Browser=> Hello Boot~! 안녕?";
	}
}
