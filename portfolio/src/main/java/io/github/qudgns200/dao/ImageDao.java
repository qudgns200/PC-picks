package io.github.qudgns200.dao;

import java.util.ArrayList;
import java.util.HashMap;

import io.github.qudgns200.model.Image;

public interface ImageDao {
	
	public ArrayList<Image> selectAll();
	public Image selectOne(int no);
	public int insertImage(HashMap<String, String> map);
}
