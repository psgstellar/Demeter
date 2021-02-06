package demeter.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/Main.do")
	public String Main() throws Exception {
		
		return "main/main";
	}
}
