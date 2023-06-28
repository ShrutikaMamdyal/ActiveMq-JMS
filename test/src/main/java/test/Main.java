package test;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ctrlf.jmsdemo.SiteDAO;

public class Main {
	public static void main(String[] args) {
		// Load Spring configuration file
	
		ApplicationContext context = new ClassPathXmlApplicationContext("applictaionContext.xml");

		SiteDAO siteDAO=(SiteDAO) context.getBean("siteDAO");
		
		siteDAO.processBatch();
		
		
	}

}