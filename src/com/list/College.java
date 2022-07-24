package com.list;

import java.util.ArrayList;

public class College {
	public ArrayList admissionProcess() {

		Student s1 = new Student();
		s1.setId(1);
		s1.setName("abc");
		s1.setAddress("pune");

		Student s2 = new Student();
		s2.setId(2);
		s2.setName("pqr");
		s2.setAddress("mumbai");

		Student s3 = new Student();
		s3.setId(3);
		s3.setName("xyz");
		s3.setAddress("nashik");

		ArrayList students = new ArrayList();
		students.add(s1);
		students.add(s2);
		students.add(s3);

		return students;

	}
}
