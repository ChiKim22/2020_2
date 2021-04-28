package CH10;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class MyFrame1 extends JFrame{
	
	private JButton button;
	private JLabel label;
	
	
	public MyFrame1() {
		this.setSize(300, 200); // Frame Size = width, height
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close 누르면 프로세스도 종료.
		this.setTitle("Event 예제");
		
		
		JPanel panel = new JPanel();
		
		button = new JButton("Click Button");
		
		label = new JLabel("아직 버튼이 눌러지지 않았습니다.");

		//		button.addActionListener(new MyListener1(label));
//		button.addActionListener(new MyInnerListener());
//		button.addActionListener((ActionListener) this.button);
		
		
		button.addActionListener((e)->label.setText("Button Clicked!!!")); // Lamda
		
		panel.add(button); // 배치관리자가 배치를 해줌 기본은 Flow 레이아웃.
		panel.add(label);
		
		this.add(panel);
		
		this.setVisible(true);
	}
	private class MyInnerListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			label.setText("버튼이 눌러 졌습니다!!!....");
		}
		
	}
}
