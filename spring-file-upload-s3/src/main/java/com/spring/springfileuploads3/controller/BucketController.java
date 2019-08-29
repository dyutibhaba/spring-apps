/**
 * 
 */
package com.spring.springfileuploads3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.spring.springfileuploads3.service.AmazonClient;

/**
 * @author Bhabadyuti Bal
 *
 */
@RestController
@RequestMapping("/rest/storage")
public class BucketController {
	
	@Autowired
	private AmazonClient amazonClient;
	
	
	@PostMapping("/uploadFile")
	@CrossOrigin
    public @ResponseBody String uploadFile(@RequestPart(value = "file") MultipartFile file) {
		String fileName = this.amazonClient.uploadFile(file);
		return fileName;
    }

    @DeleteMapping("/deleteFile")
    public String deleteFile(@RequestPart(value = "url") String fileUrl) {
        return this.amazonClient.deleteFileFromS3Bucket(fileUrl);
    }

}
