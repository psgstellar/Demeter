package demeter.service;

import java.util.List;

import demeter.vo.UserVO;

public interface UserService {

	public List<UserVO> userinfolist() throws Exception;
}
