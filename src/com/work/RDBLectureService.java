package com.work;

import java.util.ArrayList;
import java.util.List;

public class RDBLectureService implements LectureService{

	@Override
	public void insertLecture(LectureDAO dao) {
		System.out.println("insert success");
	}

	@Override
	public List<LectureDAO> selectLecture() {
		LectureDAO lectureDAO = new LectureDAO();
		lectureDAO.setComment("Lecture description.");
		lectureDAO.setName("CI environment");
		lectureDAO.setInstructor("chj");
		
		List<LectureDAO> lectureList = new ArrayList<LectureDAO>();
		lectureList.add(lectureDAO);
		
		return lectureList;
	}

}
