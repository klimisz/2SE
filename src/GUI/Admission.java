package GUI;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JFormattedTextField;

import java.awt.Dimension;
import java.text.Format;
import java.text.SimpleDateFormat;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Admission extends JScrollPane {

	/**
	 * Create the panel.
	 */
	public Admission(Start s) {
		
		
		setBounds(0, 0, 600, 800);
		setPreferredSize(new Dimension(1000, 600));
		setVerticalScrollBarPolicy(VERTICAL_SCROLLBAR_AS_NEEDED);
		setHorizontalScrollBarPolicy(HORIZONTAL_SCROLLBAR_AS_NEEDED); 
		JPanel panel = new JPanel();
		add(panel);
		setViewportView(panel);
		panel.setLayout(null);
		
		panel.setPreferredSize(new Dimension(1421,1063));
		
		
		
		
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(47, 167, 460, 213);
		panel.add(textPane);
		
		JLabel label = new JLabel("\u0397\u03BC\u03B5\u03C1\u03BF\u03BC\u03B7\u03BD\u03AF\u03B1 \u0395\u03B9\u03C3\u03B1\u03B3\u03C9\u03B3\u03AE\u03C2:");
		label.setBounds(47, 96, 114, 14);
		panel.add(label);
		
		JFormattedTextField formattedTextField = new JFormattedTextField(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"));
		formattedTextField.setBounds(176, 93, 171, 20);
		panel.add(formattedTextField);
		formattedTextField.setValue(new java.util.Date());
		
		JLabel label_1 = new JLabel("\u03A3\u03C5\u03BC\u03C0\u03C4\u03CE\u03BC\u03B1\u03C4\u03B1:");
		label_1.setBounds(47, 142, 64, 14);
		panel.add(label_1);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(47, 492, 460, 213);
		panel.add(textPane_1);
		
		JLabel label_2 = new JLabel("\u0391\u03BB\u03B5\u03C1\u03B3\u03AF\u03B5\u03C2/\u03A0\u03B1\u03C1\u03B1\u03C4\u03B7\u03C1\u03AE\u03C3\u03B5\u03B9\u03C2:");
		label_2.setBounds(47, 467, 116, 14);
		panel.add(label_2);
		
		JButton btnNewButton = new JButton("\u0391\u03C0\u03BF\u03B8\u03AE\u03BA\u03B5\u03C5\u03C3\u03B7");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Condb.insertPatient(Main_screen.amCode, formattedTextField.getText(), textPane.getText(), textPane_1.getText());
			}
		});btnNewButton.setBounds(47, 750, 93, 23);
		panel.add(btnNewButton);
		
		JButton button = new JButton("\u0395\u03B9\u03C3\u03B1\u03B3\u03C9\u03B3\u03AE");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s.SetCard("1");
			}
		});
		button.setBounds(146, 750, 89, 23);
		panel.add(button);
		
		JButton button_1 = new JButton("\u0386\u03BA\u03C5\u03C1\u03BF");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s.SetCard("1");
			}
		});
		button_1.setBounds(245, 750, 89, 23);
		panel.add(button_1);
		
		JLabel label_3 = new JLabel("\u0395\u03B9\u03C3\u03B1\u03B3\u03C9\u03B3\u03AE \u0391\u03C3\u03B8\u03B5\u03BD\u03BF\u03CD\u03C2");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_3.setBounds(219, 29, 160, 20);
		panel.add(label_3);

	}
}
