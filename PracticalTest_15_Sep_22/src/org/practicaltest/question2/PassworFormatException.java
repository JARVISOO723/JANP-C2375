package org.practicaltest.question2;

public class PassworFormatException extends Exception {
	String wrongPsw;
	PassworFormatException(String psw){
		wrongPsw = psw;
	}
	public String toString() {
		return ("password length must be greater then 6 characters : " + wrongPsw );
	}

}
