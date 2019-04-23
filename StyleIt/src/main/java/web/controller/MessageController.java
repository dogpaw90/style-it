package web.controller;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import web.dto.Message;
import web.service.face.MessageService;

@Controller
public class MessageController {
	
	public MessageService mServ;
	private static final Logger logger=LoggerFactory.getLogger(MessageController.class);
	
	public void msgRoomList(Model model) {
	
	}
	
	public void msgList(int mr_no, Model model) {
	
	}
	
	public void msgsend(Message msg, @RequestParam HashMap<String, Object> map) {
	
	}
}
