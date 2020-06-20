package io.github.qudgns200.dao;

import java.util.ArrayList;

import io.github.qudgns200.model.Image;

public interface ImageDao {
	
	public ArrayList<Image> selectAll();
	public Image selectOne(int no);
}
