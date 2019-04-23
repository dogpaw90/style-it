package web.service.face;
import java.util.HashMap;
import java.util.List;

import web.dto.Message;
import web.dto.MessageRoom;

public interface MessageService {
	
	public List<MessageRoom> getRoomList(int m_no);
	
	public List<Message> getMsgList(int mr_no);
	
	public void sendMsg(HashMap<String, Object> map);
}
