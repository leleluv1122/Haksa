package ten;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class OutterClass5 extends JFrame {

	String message = "Ŭ��";

	public OutterClass5() {
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		JButton button = new JButton("��ư");
		button.setBounds(100, 100, 100, 30);
		getContentPane().add(button);

		ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(OutterClass5.this, message);
			}
		};
		button.addActionListener(listener);
	}

	public static void main(String[] args) {
		OutterClass5 window = new OutterClass5();
		window.setVisible(true);
	}
}