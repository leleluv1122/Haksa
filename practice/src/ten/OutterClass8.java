package ten;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class OutterClass8 extends JFrame {

	String message = "Ŭ��";

	public OutterClass8() {
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		JButton button = new JButton("��ư");
		button.setBounds(100, 100, 100, 30);
		getContentPane().add(button);

		button.addActionListener(e -> JOptionPane.showMessageDialog(OutterClass8.this, message));
	}

	public static void main(String[] args) {
		OutterClass8 window = new OutterClass8();
		window.setVisible(true);
	}
}