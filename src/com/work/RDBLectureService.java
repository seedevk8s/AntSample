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
		lectureDAO.setComment("���� �����Դϴ�.");
		lectureDAO.setName("CI ȯ�� ����");
		lectureDAO.setInstructor("�Ұ�");
		
		List<LectureDAO> lectureList = new ArrayList<LectureDAO>();
		lectureList.add(lectureDAO);
		
		return lectureList;
	}

}
