package etanaProjectPackage;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.testing.framework.EmailUtils;

public class AutoEmail {

	public static void main(String[] args) throws Exception {
		
		EmailUtils emailUtils=new EmailUtils();
		Properties prop=new Properties();
		prop.load(new FileInputStream("C:\\Users\\SantoshKambale\\eclipse-workspace\\usingAutomationUtilities\\Test.properties"));
		List <String> attachments=new ArrayList<>();
		attachments.add("C:\\Users\\SantoshKambale\\eclipse-workspace\\etanaProject_Cucumber\\target\\cucumber-report-html\\cucumber-html-reports\\feature-overview.html");
		emailUtils.sendUsingGmail(prop, "Test Execution Report", "Success",attachments);
		

	}

	}
