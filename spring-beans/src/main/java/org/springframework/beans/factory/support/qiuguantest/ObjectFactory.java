package org.springframework.beans.factory.support.qiuguantest;

/**
 * @author: qiuguan
 * date: 2021/11/12 - 下午10:37
 */
@FunctionalInterface
public interface ObjectFactory<T> {

	/**
	 * get Object
	 * @return
	 */
	T getObject();
}
