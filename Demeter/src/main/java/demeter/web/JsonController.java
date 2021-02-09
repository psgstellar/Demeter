package demeter.web;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JsonController {

	@GetMapping("/Test.do")
	public Object Test() throws Exception{
		HashMap<String, String> map = new HashMap<>();
		map.put("test", "test123");
		map.put("test1", "testtest");
		
		return map;
	}
}
