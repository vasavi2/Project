package com.home.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.home.demo.Service.FileUploadService;



@RestController
@CrossOrigin
public class FileUploadController {
	public static String uploadDirectory = System.getProperty("user.dir") + "/uploads";

	@Autowired
	FileUploadService fileUploadService;

	
	  @PostMapping(path = "/upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE) public
	  String uploadFile( @RequestParam("image") MultipartFile[] files)
	  {
	  
	  StringBuilder fileNames = fileUploadService.uploadFile(files,
	  uploadDirectory);
	  
	  return "Successfully uploaded files";
	  
	  }
	 

}