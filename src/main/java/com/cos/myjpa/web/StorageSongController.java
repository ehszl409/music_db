package com.cos.myjpa.web;

import org.springframework.web.bind.annotation.RestController;

import com.cos.myjpa.service.StorageSongService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class StorageSongController {

	private final StorageSongService storageSongService;
}
