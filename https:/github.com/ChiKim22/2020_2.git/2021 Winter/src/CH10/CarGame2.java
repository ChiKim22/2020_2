package CH10;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.*;

public class CarGame2 extends JFrame{ //퍼블릭 클래스는 하나만 가능.

}
class MyPanel extends JPanel implements KeyListener{
	BufferedImage img = null;
	private int imgX = 100, imgY = 100;
	
	public MyPanel() {
		try {
		img = ImageIO.read(new File("AppleCar.jpg"));
		} catch (IOException e) {
			System.out.println("No Image");
			System.exit(1);
		}
		this.addKeyListener(this);
		
		this.setFocusable(true);
		this.requestFocus();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		switch(e.getKeyCode()) {
		case KeyEvent.VK_UP:
	
			break;
		case KeyEvent.VK_DOWN:
			
			break;
		case KeyEvent.VK_LEFT:
			
			break;
		case KeyEvent.VK_RIGHT:
			
			break;
		}
		this.repaint();
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
