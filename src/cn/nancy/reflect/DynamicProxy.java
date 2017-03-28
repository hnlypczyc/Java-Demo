package cn.nancy.reflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler {

	private Object obj;
	public DynamicProxy(Object obj){
		this.obj=obj;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("Before method");
		Object result = method.invoke(obj, args);
		System.out.println("After method");
		return result;
	}

}
