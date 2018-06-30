package ch07;
class SutdaCard{
	int num;
	boolean isKwang;
	
	SutdaCard(int n, boolean b){
		this.num =n;
		this.isKwang=b;
	}
	SutdaCard(){
		this.num = 1;
		this.isKwang = true;
	}
	
	String info(){
		return num + (isKwang==true ? "K" : " ");
	}
}
public class exam601 {
	public static void main(String[] args) {
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		
		System.out.println(card1.info());
		System.out.println(card2.info());
	}
}
