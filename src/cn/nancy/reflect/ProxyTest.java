package cn.nancy.reflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ProxyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InvocationHandler dp= new DynamicProxy(new Vender());
		Sell sell =(Sell) (Proxy.newProxyInstance(Sell.class.getClassLoader(), new Class[] {Sell.class},dp ));
		sell.sale();
		sell.receiveMoney();
	}

}
