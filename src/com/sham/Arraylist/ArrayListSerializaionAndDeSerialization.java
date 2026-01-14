package com.sham.Arraylist;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArrayListSerializaionAndDeSerialization {

	public static void main(String[] args) throws IOException {

		ArrayList<String> list = new ArrayList<>();

		list.add("deepak");
		list.add("rutuja");
		list.add("vishwa");
		list.add("abhishek");

//		Serialization

		var fos = new FileOutputStream("c:\\image\\arraylist.txt");
		var oos = new ObjectOutputStream(fos);

		try (fos; oos) {
			oos.writeObject(list);
			System.out.println("Object stored in file");

		} catch (Exception e) {

		}

//		De-Serialization

		var fis = new FileInputStream("c:\\image\\arraylist.txt");
		var ois = new ObjectInputStream(fis);

		try (fis; ois) {
			@SuppressWarnings("unchecked")
			ArrayList<String> readList = (ArrayList<String>) ois.readObject();

			System.out.println(readList);
		} catch (Exception e) {

		}
	}
}
