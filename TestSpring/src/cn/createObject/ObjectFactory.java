package cn.createObject;

public class ObjectFactory {
	
	
	//ʵ��������������
	public User getInstance() {
		return new User(20, "����������ʵ������");
	}
	
	public static User getStaticInstance() {
		return new User(100, "���������þ�̬ʵ������");
	}
}
