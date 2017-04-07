package cn.nancy.file;

public class DiGui {
	public static void main(String[] args) {
		int Sum =0;
		DiGui dg = new DiGui();
		Sum = dg.JieCheng(5);
		System.out.println(Sum);
	}
	
	public int JieCheng(int n){
		int sum=0;
		if (n==1) {
			sum = 1;
			return sum;
		}else{
		sum=n*JieCheng(n-1);
		return sum;
		}
	}
}
