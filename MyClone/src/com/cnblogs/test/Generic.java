package com.cnblogs.test;

/**
 * ������ʾ��
 * @author ��Ԫ
 *
 */
public class Generic {
	/**
	 * ���ͷ���
	 * @param <T> ����һ������T
	 * @param c �����������Ͷ���
	 * @return
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public <T> T getObject(Class<T> c) throws InstantiationException, IllegalAccessException{
		//�������Ͷ���
		T t = c.newInstance();
		return t;
	}
}
