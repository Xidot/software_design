package render;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Container;

public class Render {
	JFrame window;
	Container con;
	JPanel titlePanel;
	JLabel titleLabel;
	Font titleFont = new Font("Times New Roman", Font.PLAIN, 40);

	public Render() {
		window = new JFrame();
		window.setSize(800, 600);
		window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.black);
		window.setLayout(null);
		window.setVisible(true);
		con = window.getContentPane();

		titlePanel = new JPanel();
		titlePanel.setBounds(100, 100, 600, 150);
		titlePanel.setBackground(Color.black);
		con.add(titlePanel);

		titleLabel = new JLabel("yeet boi");
		titlePanel.setForeground(Color.white);
		titleLabel.setFont(titleFont);
		titlePanel.add(titleLabel);
	}
}
