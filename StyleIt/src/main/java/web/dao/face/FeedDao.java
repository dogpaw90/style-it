package web.dao.face;

import java.util.HashMap;
import java.util.List;

import web.dto.Feed;

public interface FeedDao {

	public List<Feed> selectAll();
	public List<Feed> selectFollow(int m_no);
	public Feed selectFeed(int f_no);
	public void insertProductLike(int m_no);
	public void insertStylingLike(int m_no);
	public void insertCollectionLike(HashMap<String, Integer> map);
	public void deleteProductLike(int plike_no);
	public void deleteStylingLike(int slike_no);
	public void deleteCollectionLike(int clike_no);
	public void insertToCollection(HashMap<String, Integer> map);
	public void deleteFromCollection(HashMap<String, Integer> map);
	
}
