package com.home.demo.Service;

public interface IFileUploadService<MultipartFile> {

	public StringBuilder uploadFile(MultipartFile[] files,String uploadDirectory);
}