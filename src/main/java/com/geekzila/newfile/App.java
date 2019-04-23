package com.geekzila.newfile;

import java.util.List;

import com.geekzila.newfile.model.File;
import com.geekzila.newfile.service.FileService;
import com.geekzila.newfile.service.impl.FileServiceImpl;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		FileService fileService = new FileServiceImpl();

		List<File> files = fileService.findAll();

		for (int i = 0; i < files.size(); i++) {
			File file = files.get(i);
			System.out.println("Name: " + file.getName());
		}
		
		File raja1 = new File("Raja1");
		
		System.out.println("Name: "+raja1.getName());
		
		System.out.println("After adding Raja.....");

		File raja = new File("Raja");
		fileService.add(raja);

		for (int i = 0; i < files.size(); i++) {
			File file = files.get(i);
			System.out.println("New user: " + file.getName());

			}
		System.out.println("Removing..........");
		
		fileService.delete("Raja");
		
		for (int i = 0; i < files.size(); i++) {
			File file = files.get(i);
			System.out.println("New user: " + file.getName());
		}

	}

}
