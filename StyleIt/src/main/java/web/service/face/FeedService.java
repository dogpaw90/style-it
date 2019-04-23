package web.service.face;

import java.util.HashMap;
import java.util.List;

import web.dto.Feed;

public interface FeedService {

	public List<Feed> getFeedList();
	public List<Feed> getFollowList(int m_no);
	public Feed getFeed(int f_no);
	public void addProductLike(int m_no);
	public void addStylingLike(int m_no);
	public void addCollectionLike(HashMap<String, Integer> map);
	public void deleteProductLike(int plike_no);
	public void deleteStylingLike(int slike_no);
	public void deleteCollectionLike(int clike_no);
	public void addToCollection(HashMap<String, Integer> map);
	public void deleteFromCollection(HashMap<String, Integer> map);
}
