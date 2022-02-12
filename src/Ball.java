package main;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.Color;
public class Ball {
	
	private int x,y; // vi tri
	private int dx,dy,speed; // van toc
	private Color c;
	private int size; // do lon cua bong
	private boolean up,down,left,right;
	
	public Ball() {
		x= GameWindow.WIDTH/2;
		y= GameWindow.HEIGH/2;
		 
		dx=1;
		dy=2;
		
		c=new Color(20,120,200);
		speed = 4;
		size = 20;
		up=down=left=right=false;
	}
	public void update() {
		
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
		/*
		 * x+= dx; y+=dy; //wall checks if(x<0) { dx=-dx; } if(x>GameWindow.WIDTH) {
		 * dx-=dx; } if(y<0) { dy=-dy; } if(y>GameWindow.WIDTH) { dy-=dy; }
		 */
		
	}

	public void KeyPressed(int k) /* nhan thong tin tu KeyEvent */ {
		if(k == KeyEvent.VK_UP) {
			up = true;
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
	public void KeyReleased(int k) /* nhan thong tin tu KeyEvent */{
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
		x = mousex;
		y = mousey;
	}
	public void draw(Graphics2D g2) {
		g2.setColor(c);
		g2.fillOval(x, y, size, size);
	}
	
}
