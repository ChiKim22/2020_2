package CH10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyButton extends JButton{
	static int count=0, index;
	public MyButton(String s) {
		super(s);
		index = count++;
	}
}

public class Puzzle extends JFrame implements ActionListener{
	
	MyButton[] btn;
	MyButton reset;
	public Puzzle() {
		super("Puzzle");
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(0, 3, 3, 2));
		btn = new MyButton[9];
		for(int i=0; i<8; i++)
			btn[i] = new MyButton(" "+(i+1));
			btn[8] = new MyButton(" ");
			
			for(int i=0; i<9; i++)
				panel.add(btn[i]);
			for(int i=0 ;i<9; i++)
				btn[i].addActionListener(this);
			add(panel, BorderLayout.CENTER);
			
			reset = new MyButton("Reset");
			reset.setBackground(Color.red);
			reset.setForeground(Color.blue);
			
			add(reset, BorderLayout.SOUTH);
			
			setSize(300, 300);
			
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setVisible(true);
		
		
	}
	public void actionPerformed(ActionEvent e) {
		MyButton b = (MyButton) e.getSource();
		if(b.getText().equals(" ")== true) return;
		if(b.index == 0) {
			if(btn[1].getText().equals(" ")) {
				btn[1].setText(b.getText()); b.setText(" ");
			}
			if(btn[3].getText().equals(" ")) {
				btn[3].setText(b.getText()); b.setText(" ");
			}
				
		}
		if(b.index == 1) {
			if(btn[0].getText().equals(" ")) {
				btn[0].setText(b.getText()); b.setText(" ");
			}
			if(btn[2].getText().equals(" ")) {
				btn[2].setText(b.getText()); b.setText(" ");
			}
			if(btn[4].getText().equals(" ")) {
				btn[4].setText(b.getText()); b.setText(" ");
			}
				
		}
		if(b.index == 2) {
			if(btn[1].getText().equals(" ")) {
				btn[1].setText(b.getText()); b.setText(" ");
			}
			if(btn[5].getText().equals(" ")) {
				btn[5].setText(b.getText()); b.setText(" ");
			}
				
		}
		if(b.index == 3) {
			if(btn[0].getText().equals(" ")) {
				btn[0].setText(b.getText()); b.setText(" ");
			}
			if(btn[4].getText().equals(" ")) {
				btn[4].setText(b.getText()); b.setText(" ");
			}
			if(btn[6].getText().equals(" ")) {
				btn[6].setText(b.getText()); b.setText(" ");
			}
				
		}

		if(b.index == 4) {
			if(btn[1].getText().equals(" ")) {
				btn[1].setText(b.getText()); b.setText(" ");
			}
			if(btn[3].getText().equals(" ")) {
				btn[3].setText(b.getText()); b.setText(" ");
			}
			if(btn[5].getText().equals(" ")) {
				btn[5].setText(b.getText()); b.setText(" ");
			}
			if(btn[7].getText().equals(" ")) {
				btn[7].setText(b.getText()); b.setText(" ");
			}
				
		}
		if(b.index == 5) {
			if(btn[2].getText().equals(" ")) {
				btn[2].setText(b.getText()); b.setText(" ");
			}
			if(btn[4].getText().equals(" ")) {
				btn[4].setText(b.getText()); b.setText(" ");
			}
			if(btn[8].getText().equals(" ")) {
				btn[8].setText(b.getText()); b.setText(" ");
			}
				
		}
		if(b.index == 6) {
			if(btn[3].getText().equals(" ")) {
				btn[3].setText(b.getText()); b.setText(" ");
			}
			if(btn[7].getText().equals(" ")) {
				btn[7].setText(b.getText()); b.setText(" ");
			}

		}
		if(b.index == 7) {
			if(btn[4].getText().equals(" ")) {
				btn[4].setText(b.getText()); b.setText(" ");
			}
			if(btn[6].getText().equals(" ")) {
				btn[6].setText(b.getText()); b.setText(" ");
			}
			if(btn[8].getText().equals(" ")) {
				btn[8].setText(b.getText()); b.setText(" ");
			}
				
		}
		if(b.index == 8) {
			if(btn[5].getText().equals(" ")) {
				btn[5].setText(b.getText()); b.setText(" ");
			}
			if(btn[7].getText().equals(" ")) {
				btn[7].setText(b.getText()); b.setText(" ");
			}
				
		}
		
	}
	public static void main(String[] args) {
		new Puzzle();
	}


}
