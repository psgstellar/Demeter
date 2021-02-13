package demeter.mapper;

import java.util.List;

import demeter.vo.UserVO;
import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("UserMapper")
public interface UserMapper {
	public List<UserVO> userinfolist() throws Exception;
}
