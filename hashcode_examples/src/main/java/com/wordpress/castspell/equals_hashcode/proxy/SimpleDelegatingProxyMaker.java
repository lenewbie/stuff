package com.wordpress.castspell.equals_hashcode.proxy;

import java.lang.reflect.Method;

import com.wordpress.castspell.equals_hashcode.model.SomeClass;

import javassist.util.proxy.MethodFilter;
import javassist.util.proxy.MethodHandler;
import javassist.util.proxy.ProxyFactory;
import javassist.util.proxy.ProxyObject;

public class SimpleDelegatingProxyMaker {
	
	public static SomeClass buildSomeClass(final SomeClass baseObject) {
		ProxyFactory f = new ProxyFactory();
		f.setSuperclass(SomeClass.class);
		f.setFilter(new MethodFilter() {
			public boolean isHandled(Method m) {
				return !m.getName().equals("finalize");
			}
		});
		@SuppressWarnings("rawtypes")
		Class c = f.createClass();
		MethodHandler mi = new MethodHandler() {
			public Object invoke(Object self, Method m, Method proceed, Object[] args) throws Throwable {
				return m.invoke(baseObject, args);
			}
		};
		SomeClass foo = null;
		try {
			foo = (SomeClass) c.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
			return null;
		}
		((ProxyObject) foo).setHandler(mi);
		return foo;
	}

}
