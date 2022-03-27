package com.home.demo.Service;

import java.io.IOException;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.home.demo.Entity.Application;
import com.home.demo.Entity.Document;

@Service
public class FileUploadService implements IFileUploadService<MultipartFile> {

	public StringBuilder uploadFile(MultipartFile[] files, String uploadDirectory) {
		StringBuilder fileNames = new StringBuilder();
		int i = 0;
		Application appl = new Application();
		appl.setAppId(101);
		for (MultipartFile file : files) {
			/*
			 * Path fileNameAndPath = Paths.get(uploadDirectory,
			 * file.getOriginalFilename()); fileNames.append(file.getOriginalFilename());
			 * try { Files.write(fileNameAndPath, file.getBytes()); } catch (IOException e)
			 * { e.printStackTrace(); }
			 */
			Document doc = new Document();
			switch (i) {
			case 0:
				doc.setDocName("Aadhar");

				break;
			case 1:
				doc.setDocName("pancard");
				break;
			case 2:
				doc.setDocName("Property");
				break;
			default:
				break;

			}
			i++;
			try {
				doc.setDocument(file.getBytes());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			doc.setApplication(appl);
		}
		return fileNames;
	}
}
