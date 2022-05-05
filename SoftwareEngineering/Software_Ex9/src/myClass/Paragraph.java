package myClass;

public class Paragraph {
	                                    
	public static String catWhiteSpace(String orig) { 

		if (orig == null)    // 1
			return null;	//2
	
		StringBuilder result = new StringBuilder(); 
		int length = orig.length();
		int i = 0;                                // 3
		
		while (i < length) { //4
			char ch = orig.charAt(i);   //5
		
			if (isWhiteSpace(ch))      //6
				result.append(' '); //7
			
			while (isWhiteSpace(ch)) { //8  
				i++;                   //9
				if (i >= length) //10
					break; //11
				ch = orig.charAt(i);  //12
			}
			
			if (!isWhiteSpace(ch))     //13 
				result.append(ch);  //14  
			
			i++; //15
		}
		
		return result.toString(); // 16
	} //17 종료
	 
	
	static boolean isWhiteSpace(char ch) {
		if (ch == ' ' || ch == '\t')
			return true;
		else
			return false;
	}
}