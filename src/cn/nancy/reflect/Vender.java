package cn.nancy.reflect;

public class Vender implements Sell {

	@Override
	public void sale() {

		System.out.println("Sale the production...");
	}

	@Override
	public void receiveMoney() {
		System.out.println("Receive the money from buyer...");
	}

}
