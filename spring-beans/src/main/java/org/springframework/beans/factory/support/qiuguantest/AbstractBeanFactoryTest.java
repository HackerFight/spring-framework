package org.springframework.beans.factory.support.qiuguantest;


import org.springframework.beans.factory.BeanCreationException;

/**
 * @author: qiuguan
 * date: 2021/11/12 - 下午10:37
 */
public class AbstractBeanFactoryTest {

	public static void main(String[] args) {


		AbstractBeanFactory f = new DefaultConfigBeanFactory();

		DefaultSingletonBeanRegistry registry = new DefaultSingletonBeanRegistry();
		Object bean = registry.getSingleton("a", () -> {

			try {
				return f.createBean("a", null, null);
			} catch (BeanCreationException e) {
				e.printStackTrace();
				return null;
			}
		});

		System.out.println(bean);
	}

}
