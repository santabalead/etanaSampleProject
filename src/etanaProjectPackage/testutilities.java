package etanaProjectPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Properties;

import javax.mail.Store;

import com.testing.framework.EmailUtils;


public class testutilities {

	public static void main(String[] args) throws FileNotFoundException, Exception {

		EmailUtils emailUtils=new EmailUtils();
		Properties prop=new Properties();
		prop.load(new FileInputStream("C:\\Users\\SantoshKambale\\eclipse-workspace\\usingAutomationUtilities\\Test.properties"));
		Store connection=emailUtils.connectToGmail(prop);
		emailUtils.getUnreadMessages(connection, "Inbox");
		
		List<String> emailtext=emailUtils.getUnreadMessageByFromEmail(connection, "Inbox", "qa.metabrokr.cust.service@gmail.com", "Confirm your email address to activate your account");
	
		if (emailtext.size()<1)
			throw new Exception("No Email Received");
		else
		{
			String regex="[^\\d]+";
			String[] OTP=emailtext.get(0).split(regex);
			System.out.println("OTP is : "+OTP[1]);
		}
		
		

	}

}
