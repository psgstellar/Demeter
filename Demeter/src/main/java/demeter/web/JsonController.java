package demeter.web;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import demeter.service.UserService;
import demeter.vo.UserVO;

@RestController
public class JsonController {

	@Resource(name="UserService")
	private UserService userservice;
	
	@GetMapping("/Test.do")
	public Object Test() throws Exception{
		HashMap<String, String> map = new HashMap<>();
		map.put("test", "test123");
		map.put("test1", "testtest");
		
		return map;
	}
	@GetMapping("/DBTest.do")
	public Object DBTest() throws Exception{
		List<UserVO> vo = userservice.userinfolist();
		return vo;
	}
}
