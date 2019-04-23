package com.geekzila.newfile.service;

import java.util.List;

import com.geekzila.newfile.model.File;

public interface FileService {

	public void add(File file);

	public List<File> findAll();

	public File get(String name);

	public void delete(String name);
}
