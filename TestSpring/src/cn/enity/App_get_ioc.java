package cn.enity;


import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class App_get_ioc {
	
	//1.ͨ��������õ�IOC���������Ķ���
		@Test
		public void TestIOC(){
			//��������
			//User user = new User();
			
			//���ڣ��Ѷ���Ĵ�������spring��IOC����
			Resource resource = new ClassPathResource("cn/test/applicationContext.xml");
			String path = "cn/enity/applicationContext.xml";
			Resource resource2 = new ClassPathResource(path );  //��Դ�൱��
			//������������bean�Ĺ����� IOC���� = ������ + applicationContext.xml
			BeanFactory factory = new XmlBeanFactory(resource);
			BeanFactory factory2 = new XmlBeanFactory(resource);
			
			//�õ����������Ķ���
			User user =(User) factory.getBean("user");
			
			System.out.println(user.getId());
		}
		
		//2.(���㣩ֱ�ӵõ�IOC��������
		@Test
		public void Testac(){
			//1.�õ�IOC��������
			ApplicationContext  ac = new ClassPathXmlApplicationContext("cn/enity/applicationContext.xml");
			//�������л�ȡbean
			User user = (User) ac.getBean("user");
			
			System.out.println(user.getId());
		}
		
}
