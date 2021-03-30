package com.cos.myjpa.service;

import org.springframework.stereotype.Service;

import com.cos.myjpa.domain.storageSong.StorageSongRepo;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class StorageSongService {

	private final StorageSongRepo storageSongRepo;
	
}
