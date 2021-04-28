package CH10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyEventTest extends JFrame implements KeyListener{
	private JPanel panel;
	private JTextField field;
	private JTextArea area;
	
	public KeyEventTest() {
		// TODO Auto-generated method stub
		panel = new JPanel();
		panel.add(new JLabel("문자를 입력하시오."));
		field = new JTextField(10);
		panel.add(field);
		field.addKeyListener(this);
		
		area = new JTextArea(3, 30);
		
		this.add(panel, BorderLayout.NORTH);
		this.add(area, BorderLayout.CENTER);
		
		this.setSize(400, 200);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		JFrame frame = new KeyEventTest();
	}

	

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		display(e, "key Pressed");
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		display(e, "key Relesed");
	}	

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		display(e, "key Typed");
	}

	private void display(KeyEvent e, String s) {
		// TODO Auto-generated method stub
		char c = e.getKeyChar();
		int keyCode = e.getKeyCode();
		System.out.println("\n");
		System.out.println("Event:"+ s + ", char"+ c+ ", code["+keyCode+"]");
		String str = "Alt"+e.isAltDown()+", Shift"+ e.isShiftDown()+", Control"+e.isControlDown();
		this.area.append(str);
		this.area.append("Event:"+ s + ", char"+ c+ ", code["+keyCode+"]");
	}


}
