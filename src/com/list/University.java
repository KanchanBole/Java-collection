package com.list;

import java.util.ArrayList;
import java.util.Iterator;

public class University {

	public static void main(String[] args) {

		College college = new College();

		ArrayList students = college.admissionProcess();
		/*
		 * for (Object object : students) {
		 *  Student student=(Student)object;
		 * System.out.println(student);
		 * }
		 */

		Iterator itr = students.iterator();

		while (itr.hasNext()) {
			Object object = itr.next();
			Student student = (Student) object;
			System.out.println(student);

		}

	}

}
