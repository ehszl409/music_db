package com.cos.myjpa.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContexts;
import javax.persistence.Query;

import org.qlrm.mapper.JpaResultMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cos.myjpa.domain.song.Song;
import com.cos.myjpa.domain.storage.Storage;
import com.cos.myjpa.domain.storageSong.StorageSong;
import com.cos.myjpa.domain.storageSong.StorageSongRepo;
import com.cos.myjpa.web.dto.storageSong.StorageSongQlrm;
import com.cos.myjpa.web.dto.storageSong.StorageSongRespDto;
import com.cos.myjpa.web.dto.storageSong.StorageSongSaveReqDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class StorageSongService {

	private final EntityManager em;
	private final StorageSongRepo storageSongRepo;
	
	@Transactional
	public void 노래담기(StorageSong storageSong) {
		storageSongRepo.save(storageSong);
	}
	
	
	public List<StorageSongRespDto> 노래찾기(Integer storageId){
		Query query = em.createNativeQuery("select s.* from storagesong st inner join song s on st.songId = s.id where st.storageId = ? ")
				.setParameter(1, storageId);
		
		JpaResultMapper jpaResultMapper = new JpaResultMapper();
		List<StorageSongRespDto> dtos = jpaResultMapper.list(query, StorageSongRespDto.class);
		return dtos;
	}

}
