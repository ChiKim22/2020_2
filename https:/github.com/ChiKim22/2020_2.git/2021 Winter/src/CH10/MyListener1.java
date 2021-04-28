package CH10;

import java.awt.event.*;

import javax.swing.JButton;

public class MyListener1<JLabel> implements ActionListener{

	private JLabel label;
	public MyListener1(JLabel label) {
		this.label = label;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton button = (JButton)e.getSource(); //이벤트가 발생된 객체가 Object 타입으로 변환된다.
		//button.setText("Button Clicked.");
//		MyFrame1.label.setText("Button Clicked");
		
	}

}
