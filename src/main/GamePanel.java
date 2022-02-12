package main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

public class GamePanel extends JPanel {
	
	
	private BufferedImage img;
	private Graphics2D g2;
	private boolean running;
	private Ball theBall;

	public GamePanel() {
		img = new BufferedImage(GameWindow.WIDTH, GameWindow.HEIGH,
				BufferedImage.TYPE_INT_RGB); 
		g2 = (Graphics2D) img.getGraphics(); 
		running = true;
		theBall= new Ball();
		this.setFocusable(true);//
		this.requestFocus();// khong chac lam nhung de ban phim hoat dong duoc
			
		 this.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				
				theBall.KeyPressed(e.getKeyCode());
			}

			@Override
			public void keyReleased(KeyEvent e) {
				theBall.KeyReleased(e.getKeyCode());
			}
			 
		 });
		 
		 this.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				int mousex = e.getX();
				int mousey = e.getY();
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
			
			repaint();
			
			try {
				Thread.sleep(20); 
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		
	}
	// update based on time 
	public void update() {
		theBall.update();
	}
	// create image in memory
	public void draw() {
		g2.setColor(Color.WHITE);
		g2.fillRect(0, 0,GameWindow.WIDTH ,GameWindow.HEIGH);
		theBall.draw(g2);
	}
	// hang the image on the window
	public void paintComponent(Graphics g) {
		g.drawImage(img,0,0,null );
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
