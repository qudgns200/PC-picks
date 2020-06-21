package io.github.qudgns200.model;

import org.springframework.web.multipart.MultipartFile;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Image {
	private int no;
	private String email;
	private String title;
	private String desc;
	private String image;
	private MultipartFile uploadImage;
}
