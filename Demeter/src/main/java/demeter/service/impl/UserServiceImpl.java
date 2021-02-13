package demeter.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import demeter.mapper.UserMapper;
import demeter.service.UserService;
import demeter.vo.UserVO;
import lombok.extern.log4j.Log4j2;

@Service("UserService")
@Log4j2
public class UserServiceImpl implements UserService{

	@Resource(name="UserMapper")
	private UserMapper usermapper;
	
	@Override
	public List<UserVO> userinfolist() throws Exception {
		log.info("UserService"+usermapper.userinfolist());
		return usermapper.userinfolist();
	}

	
}
