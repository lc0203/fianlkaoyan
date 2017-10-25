package cn.enity;


import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class App2_get_ioc2 {
	
	/**
	 * IOC�����Ķ���Ĭ���ǵ�������
	 * scope="singleton"    [service/dao]
	 * ��Ҫ����Ϊ����
	 * scope="prototype"  [action]
	 */
		//2.(���㣩ֱ�ӵõ�IOC��������
		@Test
		public void Testac(){
			ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("cn/enity/applicationContext.xml");
		  
		  System.out.println("��������");
			//1.�õ�IOC��������
			//�������л�ȡbean
			User user = (User) ac.getBean("user");
			User user1 = (User)ac.getBean("user");
			System.out.println(user);
			System.out.println(user1);
			ac.destroy();
		}
		 
}
