package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /**
         * cau 1
         */
		Scanner sc = new Scanner(System.in);
		int dai;
		int rong;
		System.out.println("nhap chieu dai");
		dai = sc.nextInt();
		
		System.out.println("nhap chieu rong");
		rong = sc.nextInt();
		
		int dientich = dai * rong;
		int chuvi = (dai + rong) * 2;
		
		System.out.println("dien tich:" + dientich);
		System.out.println("chu vi:" + chuvi);
	    }

}
