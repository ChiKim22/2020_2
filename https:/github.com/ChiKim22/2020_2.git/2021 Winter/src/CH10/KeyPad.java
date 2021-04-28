package CH10;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyPad extends JFrame implements ActionListener{
	private JTextField textField;
	private JPanel panel;
	
	public KeyPad() {
		textField = new JTextField(20);
		this.add(textField, BorderLayout.NORTH);
		panel.setLayout(new GridLayout(3, 3));
		
		this.add(panel, BorderLayout.CENTER);
		
		for (int i=1; i<=9; i++) {
			JButton btn = new JButton(String.valueOf(i)); //버튼에 문자열 지정
			btn.setPreferredSize(new Dimension(100, 100)); // set Size
			panel.add(btn);
			btn.addActionListener(this);
		}
		this.pack();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String actionCommand = e.getActionCommand();
		textField.setText(textField.getText()+actionCommand);
	}
	public static void main(String[] args) {
		JFrame keypad = new KeyPad();
	}


	
}
