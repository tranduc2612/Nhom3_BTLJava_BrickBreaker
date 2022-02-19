package main;

import java.awt.Color; // cung cấp bảng màu 
import java.awt.Graphics; // cung cấp nhiều phương thức để lập trình đồ họa.
import java.awt.Graphics2D; // cung cấp nhiều phương thức để lập trình đồ họa cao cấp hơn 
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener; //gọi bất cứ khi nào bạn thay đổi trạng thái của bàn phím (key)
import java.awt.event.MouseEvent; 
import java.awt.event.MouseListener; //gọi bất cứ khi nào bạn thay đổi trạng thái của chuột
import java.awt.event.MouseMotionListener;  //gọi bất cứ khi nào bạn di chuyển hoặc kéo chuột.
import java.awt.image.BufferedImage; // lớp chuyên để làm việc với ảnh

import javax.swing.JPanel;

public class GamePanel extends JPanel {
	
	
	private BufferedImage img; // tạo đối tượng của BufferedImage 
	private Graphics2D g2; //tạo đối tượng Graphics2D
	private boolean running; // kiem tra trang thai chay cua game
	private Ball theBall; // khởi tạo 1 đối tượng của ball

	public GamePanel() {
		img = new BufferedImage(GameWindow.WIDTH, GameWindow.HEIGH,
				BufferedImage.TYPE_INT_RGB); //tạo một đối tượng BufferedImage với thuộc tính BufferedImage.TYPE_INT_RGB
		g2 = (Graphics2D) img.getGraphics(); // tao noi lay hinh anh cho g2
		running = true; // xét giá trị của running 
		theBall= new Ball();
		this.setFocusable(true);//
		this.requestFocus();// khong chac lam nhung de ban phim hoat dong duoc
			
		 this.addKeyListener(new KeyListener() { // tao ra su dieu khien bang nut bam 

			@Override
			public void keyTyped(KeyEvent e) {
				
			}

			@Override
			public void keyPressed(KeyEvent e) { // khi nhan giu phim
				
				theBall.KeyPressed(e.getKeyCode());
			}

			@Override
			public void keyReleased(KeyEvent e) { // khi thả phim
				theBall.KeyReleased(e.getKeyCode());
			}
			 
		 });
		 
		 this.addMouseListener(new MouseListener() { // dieu khien bang chuot 

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				int mousex = e.getX(); // di chuyen bong den vi tri x
				int mousey = e.getY(); // di chuyen bong den vi tri y
				theBall.mousePressed(mousex, mousey);
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			 
		 });
		 
		 this.addMouseMotionListener(new MouseMotionListener() {

			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			 
		 });
	}
	// Game loop
	public void playGame() {
		// game loop 
		while(running) {
			update();
			
			draw();
			
			repaint(); // vẽ lại liên tục ball 
			
			try {
				Thread.sleep(20); // lam chuong trinh dung lai 20s sau khi chay while
			}
			catch(Exception e) {
				e.printStackTrace(); // chẩn đoán exception
			}
			
		}
		
	}
	// update based on time 
	public void update() {
		theBall.update();
	}
	// create image in memory
	public void draw() {
		g2.setColor(Color.WHITE);  // gán màu 
		g2.fillRect(0, 0,GameWindow.WIDTH ,GameWindow.HEIGH); //điền màu mặc định và độ rộng và chiều cao đã cho vào hình chữ nhật.
		theBall.draw(g2);
	}
	// hang the image on the window
	public void paintComponent(Graphics g) {
		g.drawImage(img,0,0,null ); //vẽ hình ảnh đã cho tại vị trí đã cho 
	}
	private class Listener implements KeyListener {

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	
}
