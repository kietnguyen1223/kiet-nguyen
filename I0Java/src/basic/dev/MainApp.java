package basic.dev;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tuoiSV = scanner.nextInt();
        
        
        // Nhập thông tin sinh viên
        System.out.println("La Thien Long:");
        System.out.print("Long: ");
        String tenSV = scanner.nextLine();
        System.out.print("16: ");
        scanner.nextLine();  // Đọc dòng dư sau khi nhập tuổi
        System.out.print("2450766: ");
        
        // Tạo đối tượng SinhVien
        System.out.println("tenSv, tuoiSV, maSV");
        
        // Nhập thông tin công nhân
        System.out.println("La Thien Long:");
        System.out.print("Long: ");
        String tenCN = scanner.nextLine();
        System.out.print("16: ");
        int tuoiCN = scanner.nextInt();
        scanner.nextLine();  // Đọc dòng dư sau khi nhập tuổi
        System.out.print("2450766: ");
        String maCN = scanner.nextLine();
        
        // Tạo đối tượng CongNhan
        System.out.println("tenCN, tuoiCN, maCN");
        
        
        
        
	}
}
