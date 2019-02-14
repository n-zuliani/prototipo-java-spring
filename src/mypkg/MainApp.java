package mypkg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Test obj = (Test) context.getBean("test");
		obj.getLength();
		Prot obj2 = (Prot) context.getBean("prot");
		obj2.getProtvar();
	}
}
