package CH10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BackgroundChange extends JFrame implements ActionListener{
	private JButton btn1;
	private JButton btn2;
	private JPanel panel;
	
	public BackgroundChange() {
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("이벤트 예제");
		
		btn1 = new JButton("Yellow");
		btn1.addActionListener(this);
		btn2 = new JButton("Pink");
		btn2.addActionListener(this);
		
		panel.add(btn1);
		panel.add(btn2);
		
		panel = new JPanel();
		this.add(panel, BorderLayout.NORTH);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		JFrame frame = new BackgroundChange();
		}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn1) {
			this.setBackground(Color.yellow);
			this.getContentPane().setBackground(Color.yellow);
			this.panel.setBackground(Color.yellow);
		}else if(e.getSource()==btn2){
//			this.setBackground(Color.pink);
			this.getContentPane().setBackground(Color.pink);
			this.panel.setBackground(Color.pink);
		}
	}
}
