package com.cos.myjpa.domain.storage;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.format.annotation.DateTimeFormat;

import com.cos.myjpa.domain.song.CategoryType;
import com.cos.myjpa.domain.song.Song;
import com.cos.myjpa.domain.storageSong.StorageSong;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Storage {
	
	@Id //Pk
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Table, auto_increment, Sequence 
	private Integer id;
	
	private String title;
	
//	@OneToMany(mappedBy = "storage", fetch = FetchType.LAZY)
//	@JsonIgnoreProperties(value = "storage")
//	private List<StorageSong> storageSongs;
	
	
	
	// 곡 카운트??
	// private User user;
	


}
