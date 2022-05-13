package sample1;

import java.io.FileWriter;
import java.io.IOException;

public class FileOutputter implements Outputter{
	//필드
	private String filePath;
	//재정의한 메소드 
	@Override
	public void output(String message) throws IOException {
		FileWriter out = new FileWriter(filePath);
		out.write(message);
		out.close();
	}
	//setter() 메소드 
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

}
