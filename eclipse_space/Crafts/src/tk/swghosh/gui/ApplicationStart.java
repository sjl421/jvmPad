package tk.swghosh.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ApplicationStart {

	private JFrame frame;
	
	ApplicationStart() {
		initialize();
	}
	
	public static void main(String[] args) {
		new ApplicationStart();
	}
	
	void initialize() {
		frame = new JFrame("github.com/swghosh");
		frame.setBounds(100,100,400,300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container con = frame.getContentPane();
		con.setLayout(null);
		
		JButton button = new JButton("About");
		button.setIcon(null);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "www.swghosh.tk\nFollow @ github.com/swghosh");
			}
		});
		button.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		button.setBounds(275, 220, 100, 30);
		con.add(button);
		
	}
}

	