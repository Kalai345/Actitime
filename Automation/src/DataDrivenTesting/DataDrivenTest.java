package DataDrivenTesting;

import java.util.ArrayList;
import java.util.HashMap;

public class DataDrivenTest {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("https://demo.actitime.com/");
		al.add("admin");
		al.add("admin@actitime.com");
		al.add("al.get(2)");
	HashMap<String,String> hm=new HashMap<>();
	hm.put("url","https://demo.actitime.com/");
	hm.put("username", "admin");
	hm.put("Email", "admin@actitime.com");
	hm.put("password","manager");
	System.out.println(hm.get("password"));
	
	

	}

}
