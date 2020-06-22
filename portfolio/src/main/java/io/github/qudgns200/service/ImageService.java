package io.github.qudgns200.service;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

import io.github.qudgns200.dao.ImageDao;
import io.github.qudgns200.model.Image;

@Service
public class ImageService {
	@Autowired
	private ImageDao iDao;
	
	public int setImageInfo(Image image) throws IOException {
		String imageRoot = getImageRoot(image.getUploadImage());
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("EMAIL", image.getEmail());
		map.put("TITLE", image.getTitle());
		map.put("DESC", image.getDesc());
		map.put("IMAGE", imageRoot);
		return iDao.insertImage(map);
	}
	
	public String getImageRoot(MultipartFile file) throws IOException {
		String path = "D:/02_Dev/PC-picks/portfolio/src/main/resources/image";
		String fileName = file.getOriginalFilename();
		UUID uuid = UUID.randomUUID();
		File target = new File(path, uuid+"_"+fileName);
		byte[] fileData = file.getBytes();
		FileCopyUtils.copy(fileData, target);
		return path+fileName;
	}
}
