package com.yuyue.util;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
public class FileUp {
	static Logger logger = Logger.getLogger(FileUp.class);
	public List<MultipartFile> doUP(HttpServletRequest request) {
		List<MultipartFile> files = new ArrayList<MultipartFile>();
		try {
			CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(
					request.getSession().getServletContext());
			if (request instanceof MultipartHttpServletRequest) {
				// 将request变成多部分request
				MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
				Iterator<String> iter = multiRequest.getFileNames();
				// 检查form中是否有enctype="multipart/form-data"
				if (multipartResolver.isMultipart(request) && iter.hasNext()) {
					// 获取multiRequest 中所有的文件名
					while (iter.hasNext()) {
						// 一次遍历所有文件
						// MultipartFile file =
						// multiRequest.getFile(iter.next().toString());
						// if (file != null) {
						// files.add(file);
						// }
						// 适配名字重复的文件
						List<MultipartFile> fileRows = multiRequest
								.getFiles(iter.next().toString());
						if (fileRows != null && fileRows.size() != 0) {
							for (MultipartFile file : fileRows) {
								if (file != null && !file.isEmpty()) {
									files.add(file);
								}
							}
						}
					}
				}
			}
		} catch (Exception ex) {
			logger.error("解析MultipartRequest错误", ex);
		}
		return files;
	}
	
	public boolean saveFile(HttpServletRequest request) {
		String pathInfo = request.getPathInfo();
		List<MultipartFile> doUP = doUP(request);
		if(doUP!=null && doUP.size()==1 ) {
			MultipartFile multipartFile = doUP.get(0);
			File file = new File("request/file"+multipartFile.getName());
			if (!file.exists()) {
				
			}
			
			
			
		}
	}

}
