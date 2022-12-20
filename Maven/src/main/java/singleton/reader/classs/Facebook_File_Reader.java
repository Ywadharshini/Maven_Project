package singleton.reader.classs;

import java.io.IOException;

public class Facebook_File_Reader {

	private Facebook_File_Reader() {

	}
	
	public static Facebook_File_Reader getInstanceFileReader() {

		Facebook_File_Reader reader = new Facebook_File_Reader();
		return reader;
	}

	public FacebookData_Reader getInstanceDataReader() throws IOException {
		
		FacebookData_Reader reader = new FacebookData_Reader();
		return reader;
	}

}
