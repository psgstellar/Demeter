package demeter.vo;

import lombok.Data;

@Data
public class UserVO {

	private String id;
	private String slack_name;
	private String slack_nickname;
	private String kakao_nickname;
	private String content;
}
