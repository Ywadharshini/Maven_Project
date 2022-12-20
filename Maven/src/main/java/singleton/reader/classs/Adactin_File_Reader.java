package singleton.reader.classs;

import java.io.IOException;

public class Adactin_File_Reader {

	public Adactin_File_Reader() {

	}
	
	public static Adactin_File_Reader getInstanceFileReader() {

		Adactin_File_Reader reader = new Adactin_File_Reader();
		return reader;
	}

	public  AdactinData_Reader getInstanceDataReader() throws IOException {
		
		AdactinData_Reader reader = new AdactinData_Reader();
		return reader;
	}
	

}
