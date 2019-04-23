package com.geekzila.newfile.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.geekzila.newfile.model.File;
import com.geekzila.newfile.service.FileService;

public class FileServiceImpl implements FileService {

	public List<File> files = new ArrayList<File>();

	public FileServiceImpl() {
		files.add(new File("Rakesh"));
		files.add(new File("Ariv"));
	}

	public void add(File file) {
		files.add(file);
	}

	public List<File> findAll() {
		return files;
	}

	public File get(String name) {
		for (File file : files) {
			if (file.getName().equals(name)) {
				return file;
			}
		}
		return null;
	}

	public void delete(String name) {
		File fileFromDb = get(name);
		files.remove(fileFromDb);

	}
}
