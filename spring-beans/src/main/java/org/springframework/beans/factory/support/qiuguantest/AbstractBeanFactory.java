package org.springframework.beans.factory.support.qiuguantest;

import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.lang.Nullable;

/**
 * @author: qiuguan
 * date: 2021/11/12 - 下午10:39
 */
public abstract class AbstractBeanFactory {

	/**
	 * create bean
	 * @param beanName
	 * @param mbd
	 * @param args
	 * @return
	 * @throws BeanCreationException
	 */
	protected abstract Object createBean(String beanName, RootBeanDefinition mbd, @Nullable Object[] args)
			throws BeanCreationException;
}
