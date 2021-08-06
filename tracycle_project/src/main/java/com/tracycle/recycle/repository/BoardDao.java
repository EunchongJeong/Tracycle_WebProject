package com.tracycle.recycle.repository;

import java.util.HashMap;
import java.util.List;

import com.tracycle.recycle.domain.AreaVO;
import com.tracycle.recycle.domain.BoardVO;
import com.tracycle.recycle.domain.CategoryVO;
import com.tracycle.recycle.domain.FileVO;

public interface BoardDao {
	
	void writeBoard(BoardVO board) throws Exception;
	boolean updateBoard(BoardVO board) throws Exception;
	boolean updateBoardOnlyText(BoardVO board) throws Exception;
	boolean deleteBoard(int boardId) throws Exception;
	List<BoardVO> getAllBoard() throws Exception;
	List<BoardVO> findByTitle(String title) throws Exception;
	List<BoardVO> findById(String userId) throws Exception;
	List<BoardVO> findByContent(String content) throws Exception;
	List<BoardVO> findByArea(int areaId) throws Exception;
	List<BoardVO> findByCategory(int categoryId) throws Exception;
	List<BoardVO> findByStatus(int status) throws Exception;
	void addViewCount(int boardId) throws Exception;
	//추가
	void addFile(FileVO file) throws Exception;
	void deleteFiles(int boardId) throws Exception;
	BoardVO getBoard(int boardId) throws Exception;
	List<FileVO> getFiles(int boardId) throws Exception;
	FileVO getMainFile(String fileName) throws Exception;
	List<AreaVO> getAllArea() throws Exception;
	List<CategoryVO> getAllCategory() throws Exception;
	//pagination
	public List<BoardVO> getBoardLimitOffset(int offset);
	public int getBoardTotalCount();

	public List<BoardVO> findByTitleLimitOffset(HashMap<String, String> map);
	public int findByTitleTotalCount(String title);
	public List<BoardVO> findByIdLimitOffset(HashMap<String, String> map);
	public int findByIdTotalCount(String id);
	public List<BoardVO> findByContentLimitOffset(HashMap<String, String> map);
	public int findByContentTotalCount(String content);

	//추가
	public List<BoardVO> getCategoryLimitOffset(HashMap<String, Integer>map);
	public List<BoardVO> getAreaLimitOffset(HashMap<String, Integer>map);

}
