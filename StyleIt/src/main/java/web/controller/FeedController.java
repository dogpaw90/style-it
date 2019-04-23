package web.controller;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import web.service.face.FeedService;

@Controller
public class FeedController {

	@Autowired public FeedService fServ;
	private static final Logger logger=LoggerFactory.getLogger(FeedController.class);
	
	
	public void feedList(Model model) {

	}
	
	public void followFeedList(HttpSession session, Model model) {
	
	}
	
	public void feedDetail(int f_no) {
	
	}
	
	public void addProductLike(int p_no) {
		
	}
	
	public void addStylingLike(int s_no) {
		
	}
	
	public void addCollectionLike(@RequestParam HashMap<String, Integer> map) {
		
	}
	
	public void deleteProductLike(int plike_no) {
		
	}
	
	public void deleteStylingLike(int slike_no) {
		
	}
	
	public void deleteCollectionLike(int clike_no) {
		
	}
	
	public void addToCollection(@RequestParam HashMap<String, Integer> map) {
	
	}
}
