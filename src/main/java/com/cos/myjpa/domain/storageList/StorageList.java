package com.cos.myjpa.domain.storageList;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import com.cos.myjpa.domain.song.CategoryType;
import com.cos.myjpa.domain.song.Song;
import com.cos.myjpa.domain.storage.Storage;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class StorageList {
	
	@Id //Pk
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Table, auto_increment, Sequence 
	private Integer id;
	
	@OneToOne
	@JoinColumn(name = "storageId")
	private Storage storage;
	
	@CreationTimestamp
	private Timestamp createDate;
	// 곡 카운트??
	// private User user;

}
