package com.cnblogs.test;

/**
 * ���͵�����ʾ
 * @author ��Ԫ
 *
 */
public class GenericTest {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		
		Generic generic = new Generic();		
		//���÷��ͷ���
		Object obj = generic.getObject(Class.forName("com.cnblogs.test.User"));
		//�ж�obj�������Ƿ���ָ����User����
		System.out.println(obj instanceof User);
	}
}
