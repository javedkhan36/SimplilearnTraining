package com.simplilearn.phase3rest.fileupload;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileUploadController {
	
	@ResponseBody
	@RequestMapping(value="/upload" , method=RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public String fileUpload(@RequestParam("file")MultipartFile file) throws IOException {
		
		File fileObj = new File("/home/mohdjavedkhanmp/"+file.getOriginalFilename());
		
		fileObj.createNewFile();
		FileOutputStream fout = new FileOutputStream(fileObj);
		fout.write(file.getBytes());
		fout.close();
		
		return "file was uploaded successfully";

	}

}
