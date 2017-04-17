package prob02;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Goods[] goods = new Goods[COUNT_GOODS];

		// 상품 입력
		for (int i = 0; i < COUNT_GOODS; i++) {
			
			
			String name = scanner.next();
			int price = scanner.nextInt();
			int countStock = scanner.nextInt();
			
			Goods g=new Goods();
			g.setName(name);
			g.setPrice(price);
			g.setCountStock(countStock);
			
			goods[i]=g;
			//ArrayList같은건가? 배열객체랑 그안에 하나의 객체?
			
		}
		for(int i=0; i<COUNT_GOODS; i++)
			goods[i].showInfo();
		
		// 자원정리
		scanner.close();
	}
}
