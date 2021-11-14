package org.springframework.beans.factory.support.qiuguantest;

/**
 * @author: qiuguan
 * date: 2021/11/12 - 下午10:41
 */
public class DefaultSingletonBeanRegistry {


	public Object getSingleton(String beanName, ObjectFactory<?> objectFactory) {

		System.out.println("beanName: "  + beanName);

		/**
		 * 这行执行完了就跑到了。。。 f.createBean() 方法中去了。。。。
		 */
		Object object = objectFactory.getObject();

		System.out.println("object" + object);
		return object;
	}
}
