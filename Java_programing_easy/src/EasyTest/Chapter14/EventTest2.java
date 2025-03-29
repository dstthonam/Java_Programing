package EasyTest.Chapter14;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Event2 extends JFrame {
	JLabel jl;
	JButton jb1, jb2;
	
	public Event2() {
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		jb1 = new JButton("사랑합니다");
		jb2 = new JButton("행복합니다");
		jl = new JLabel("버튼을 누르세요");
				
		jb1.addActionListener(new EventProcess(jl));
		jb2.addActionListener(new EventProcess(jl));
		ct.add(jb1);
		ct.add(jb2);
		ct.add(jl);
		
		setTitle("Event Test2");
		setSize(250, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //창 닫기 설정
		setVisible(true);
		
	}
	private class EventProcess implements ActionListener {
		private JLabel label;
		
		public EventProcess(JLabel label) {
			this.label = label;
		}
		
		public void actionPerformed(ActionEvent e) {
			label.setText(e.getActionCommand());
		}
	}
}

public class EventTest2 {
	public static void main(String[] args) {
		new Event2();
	}
}