package MainPackage;

import java.util.ResourceBundle;

public class App {
	public int login(String uname, String pw) {
		ResourceBundle rb = ResourceBundle.getBundle("config");
		String user = rb.getString("username");
		String pass = rb.getString("password");
		if(uname.equals(user) && pw.equals(pass)) {
			return 1;
		}
		else {
			return 0;
		}
	}
}
