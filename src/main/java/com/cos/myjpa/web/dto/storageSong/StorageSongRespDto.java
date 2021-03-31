package com.cos.myjpa.web.dto.storageSong;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import com.cos.myjpa.domain.song.CategoryType;

import lombok.Data;

@Data
public class StorageSongRespDto {
	private Integer id;		
	private String title;	
	private String artist;		
	private CategoryType category;			
	private Integer duration;		
	private String lyrics;
	private String date;	
	private String img;
	private String file;

}
