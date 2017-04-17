package prob06;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while( true ) {
		System.out.print(">> ");	
		String exp = scanner.nextLine();
		
		String[] tokens=exp.split(" ");
		int x=Integer.valueOf(tokens[0]);
		int y=Integer.valueOf(tokens[2]);
		
		if("+".equals(tokens[1])){
			Add a= new Add();
			a.setValue(x,y);
			System.out.println(">> "+a.calculate());
		}
		else if("-".equals(tokens[1])){
			Sub a= new Sub();
			a.setValue(x,y);
			System.out.println(">> "+a.calculate());
		}
		else if("*".equals(tokens[1])){
			Mul a= new Mul();
			a.setValue(x,y);
			System.out.println(">> "+a.calculate());
		}
		else {
			Div a= new Div();
			a.setValue(x,y);
			System.out.println(">> "+a.calculate());
		}
		System.out.print(">> ");
		String conti = scanner.nextLine();
		if(conti=="quit")
			System.exit(0);
			
		}
		
	}

}
