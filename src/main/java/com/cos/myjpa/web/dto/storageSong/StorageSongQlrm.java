package com.cos.myjpa.web.dto.storageSong;

import java.sql.PreparedStatement;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class StorageSongQlrm {
	private final EntityManager em;
	
	public Query query() {
		Query query = em.createNativeQuery("select s.* from storagesong st inner join song s on st.songId = s.id where st.storageId = ?");
		return query;
	}
	
}
