package web.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import web.dao.face.FeedDao;
import web.dto.Feed;
import web.service.face.FeedService;


@Service
public class FeedServiceImpl implements FeedService {

	@Autowired FeedDao fDao;

	@Override
	public List<Feed> getFeedList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Feed> getFollowList(int m_no) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Feed getFeed(int f_no) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addProductLike(int m_no) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addStylingLike(int m_no) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addCollectionLike(HashMap<String, Integer> map) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProductLike(int plike_no) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteStylingLike(int slike_no) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCollectionLike(int clike_no) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addToCollection(HashMap<String, Integer> map) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteFromCollection(HashMap<String, Integer> map) {
		// TODO Auto-generated method stub
		
	}


}
