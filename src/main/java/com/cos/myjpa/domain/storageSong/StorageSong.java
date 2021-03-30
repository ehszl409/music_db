package com.cos.myjpa.domain.storageSong;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.hibernate.annotations.CreationTimestamp;

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
public class StorageSong {
	
	@Id //Pk
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Table, auto_increment, Sequence 
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "storageId")
	private Storage storage;
	
	@OneToOne
	@JoinColumn(name = "songId")
	private Song song;
	
	@CreationTimestamp
	private Timestamp createDate;

}
