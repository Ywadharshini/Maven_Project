package singleton.reader.classs;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FacebookData_Reader {

	public static Properties p;

	public FacebookData_Reader() throws IOException {
		File f = new File(
				"C:\\Users\\LENOVO\\eclipse-workspace\\switch\\Maven\\src\\main\\java\\singleton\\properties\\FacebookData.properties");
		FileInputStream fis = new FileInputStream(f);

		p = new Properties();

		p.load(fis);

	}

	public String getEmail() {
		String email = p.getProperty("email");
		return email;
	}
	
	public String getPassword() {
		String password = p.getProperty("password");
		return password;
	}

}
