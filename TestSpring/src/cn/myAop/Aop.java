package cn.myAop;

import org.springframework.stereotype.Component;

@Component
public class Aop {
	public void begin() {
		System.out.println("��������");
	}
	public void commit() {
		System.out.println("�ύ����");
	}
}
