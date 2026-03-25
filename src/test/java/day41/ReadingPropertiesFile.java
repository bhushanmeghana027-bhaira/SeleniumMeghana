package day41;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadingPropertiesFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		step 1] create properties for objects class
		Properties propertiesobj = new Properties();
//		step 2] open the file in reading mode
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\testdata\\config.properties");
//		step3] load the file 
		propertiesobj.load(file);
//		step 4 ] read the data
		String url = propertiesobj.getProperty("appUrl");
		String email = propertiesobj.getProperty("email");
		String pwd = propertiesobj.getProperty("password");
		String oid = propertiesobj.getProperty("orderid");
		String cid = propertiesobj.getProperty("customerid");
		
//		getting the key name
//		return type is string
		Set<String> keyNames= propertiesobj.stringPropertyNames();
//		return type is object 
		Set<Object> keyName = propertiesobj.keySet();
		
		System.out.println(keyNames);
		System.out.println(keyName);
		
//		reading all values
		Collection<Object> value =  propertiesobj.values();
		System.out.println(value);
		
		System.out.println(url);
		System.out.println(email);
		System.out.println(pwd);
		System.out.println(oid);
		System.out.println(cid);
		
		file.close();

	}

}
