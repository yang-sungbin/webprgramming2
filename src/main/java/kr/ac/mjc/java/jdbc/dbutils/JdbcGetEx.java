package kr.ac.mjc.java.jdbc.dbutils;

import kr.ac.mjc.java.jdbc.Student;

public class JdbcGetEx {
	
	public static void main(String[] args) {
		StudentDao studentDao = new StudentDao();
		Student student = studentDao.getStudent("5");
		System.out.println(student);
	}

}
