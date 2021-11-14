package org.springframework.beans.factory.support.qiuguantest;

import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * @author: qiuguan
 * date: 2021/11/12 - 下午10:46
 */
public class DefaultConfigBeanFactory extends AbstractBeanFactory {

	@Override
	protected Object createBean(String beanName, RootBeanDefinition mbd, Object[] args) throws BeanCreationException {

		System.out.println("create bean......");

		return new String("hello world");
	}
}
