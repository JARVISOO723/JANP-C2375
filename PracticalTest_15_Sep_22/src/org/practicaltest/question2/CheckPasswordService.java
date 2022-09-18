package org.practicaltest.question2;


public class CheckPasswordService {
	public static boolean addId(CheckPassword id) {
		boolean result=false;
		CheckPasswordDAO.addId(id);
		return result;
	}
	public static CheckPassword[] displayId() {
		return CheckPasswordDAO.displayId();
	}
}
