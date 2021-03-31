package com.cos.myjpa.domain.storageSong;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.cos.myjpa.domain.song.Song;
import com.cos.myjpa.web.dto.storageSong.StorageSongRespDto;

public interface StorageSongRepo extends JpaRepository<StorageSong, Integer> {
}
