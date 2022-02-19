package main;
import java.awt.Graphics2D; // // cung cấp nhiều phương thức để lập trình đồ họa cao cấp hơn 
import java.awt.event.KeyEvent;
import java.awt.Color; // bảng màu 
public class Ball {

	private int x,y; // vi tri
	private int dx,dy,speed; // van toc
	private Color c; // mau bong 
	private int size; // do lon cua bong
	private boolean up,down,left,right;

	public Ball() {
		x= GameWindow.WIDTH/2; // vi tri ban dau cua ball
		y= GameWindow.HEIGH/2;

		c=new Color(20,120,200);
		speed = 4;
		size = 20;
		up=down=left=right=false;
	}
	public void update() { // cap nhat vi tri cua ball lien tuc

		if(up) {
			y-=speed;
		}
		if(down) {
			y+=speed;
		}
		if(left) {
			x-=speed;
		}
		if(right) {
			x+=speed;
		}

	}

	public void KeyPressed(int k) /* nhan thong tin tu KeyEvent khi nhấn nút  */ {
		if(k == KeyEvent.VK_UP) {
			up = true; // thay đổi giá trị của up 
		}
		if(k == KeyEvent.VK_DOWN) {
			down = true;
		}
		if(k == KeyEvent.VK_LEFT) {
			left = true;
		}
		if(k == KeyEvent.VK_RIGHT) {
			right = true;
		}
	}
	public void KeyReleased(int k) /* nhan thong tin tu KeyEvent khi thả nút  */{
		if(k == KeyEvent.VK_UP) {
			up = false;
		}
		if(k == KeyEvent.VK_DOWN) {
			down = false;
		}
		if(k == KeyEvent.VK_LEFT) {
			left = false;
		}
		if(k == KeyEvent.VK_RIGHT) {
			right = false;
		}
	}

	public void mousePressed(int mousex,int mousey) {
		x = mousex; // gán tọa độ khi ấn chuột 
		y = mousey;
	}
	public void draw(Graphics2D g2) {
		g2.setColor(c); // gán màu
		g2.fillOval(x, y, size, size); //điền màu mặc định và độ rộng và chiều cao đã cho vào hình Oval.
	}

}
