package main;

import javax.swing.JFrame;

public class GameWindow {
	public static final int WIDTH = 640; // final de fix chieu rong chieu cao ko thay doi duoc
	public static final int HEIGH = 640;
	public static void main(String[] args) {
		JFrame theWindow = new JFrame("Game Shell");
		theWindow.setSize(WIDTH,HEIGH); // Thiết lập chiều dài và độ cao của màn hình
		theWindow.setResizable(false); // Không thể thiết lập lại độ rộng vào độ cao của màn hình
		theWindow.setLocationRelativeTo(null); // ????
		theWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // only screen chỉ cho phép người dùng 1 tab game
		theWindow.setVisible(true); // chưa rõ lắm @@ hình như là ẩn các chương trình chạy khi chạy game thì phải ???
		
	}
}
