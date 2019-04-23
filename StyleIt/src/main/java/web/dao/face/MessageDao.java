package web.dao.face;

import java.util.HashMap;
import java.util.List;

import web.dto.Message;
import web.dto.MessageRoom;

public interface MessageDao {
	public List<MessageRoom> selectRoomList(int m_no);
	public List<Message> selectMsgList(int mr_no);
	public void insertMsg(HashMap<String, Object> map);
	public void updateRead(int msg_no);
}
