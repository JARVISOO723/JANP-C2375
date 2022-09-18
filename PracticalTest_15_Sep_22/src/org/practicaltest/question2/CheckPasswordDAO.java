package org.practicaltest.question2;

public class CheckPasswordDAO {

	static CheckPassword idArray[]=new CheckPassword[5];
	public static boolean addId(CheckPassword id) {
		boolean result=false;
		
		for(int i=0;i<idArray.length;i++)
		{
			if(idArray[i]==null) {
				idArray[i]=id;
				result=true;
				break;
			}
		}
		
		return result;
	}
	public static CheckPassword[] displayId() {
		return idArray;
	}
}
