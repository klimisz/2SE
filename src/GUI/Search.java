package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Search extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private Main_screen ms;

	/**
	 * Create the frame.
	 */
	public Search(Main_screen m) {

		ms = m;

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 564, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		super.setVisible(true);

		JLabel label = new JLabel("\u038C\u03BD\u03BF\u03BC\u03B1:");
		label.setBounds(94, 74, 150, 15);
		contentPane.add(label);

		textField = new JTextField();
		textField.setBounds(94, 94, 150, 20);
		contentPane.add(textField);

		JLabel label_1 = new JLabel("\u0395\u03C0\u03CE\u03BD\u03C5\u03BC\u03BF:");
		label_1.setBounds(271, 74, 150, 15);
		contentPane.add(label_1);

		textField_1 = new JTextField();
		textField_1.setBounds(271, 94, 150, 20);
		contentPane.add(textField_1);

		JLabel label_2 = new JLabel("\u038C\u03BD\u03BF\u03BC\u03B1 \u03A0\u03B1\u03C4\u03C1\u03CC\u03C2:");
		label_2.setBounds(94, 125, 150, 15);
		contentPane.add(label_2);

		textField_2 = new JTextField();
		textField_2.setBounds(94, 145, 150, 20);
		contentPane.add(textField_2);

		JLabel label_3 = new JLabel("* \u0391.\u039C.\u039A.\u0391.");
		label_3.setBounds(94, 224, 150, 15);
		contentPane.add(label_3);

		textField_3 = new JTextField();
		textField_3.setBounds(94, 244, 150, 20);
		contentPane.add(textField_3);

		JButton button = new JButton("\u0391\u03BD\u03B1\u03B6\u03AE\u03C4\u03B7\u03C3\u03B7");
		button.setBounds(94, 294, 100, 25);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField_3.getText().length() == 11) {
					ms.SetValues(Condb.searchByAmka(textField_3.getText()));
					dispose();
				}
			}
		});

		contentPane.add(button);

		JButton button_1 = new JButton("\u0386\u03BA\u03C5\u03C1\u03BF");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		button_1.setBounds(94, 324, 100, 25);
		contentPane.add(button_1);

		textField_4 = new JTextField();
		textField_4.setBounds(271, 145, 150, 20);
		contentPane.add(textField_4);

		JLabel label_4 = new JLabel(
				"\u0397\u03BC\u03B5\u03C1\u03BF\u03BC\u03B7\u03BD\u03AF\u03B1 \u03B3\u03AD\u03BD\u03BD\u03B7\u03C3\u03B7\u03C2:");
		label_4.setBounds(271, 125, 150, 15);
		contentPane.add(label_4);

		JLabel label_5 = new JLabel("\u0391\u03BD\u03B1\u03B6\u03AE\u03C4\u03B7\u03C3\u03B7");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_5.setBounds(229, 11, 89, 20);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("(*) \u03A5\u03C0\u03BF\u03C7\u03C1\u03B5\u03BF\u03C4\u03B9\u03BA\u03CC \u03C0\u03B5\u03B4\u03B9\u03CC");
		label_6.setForeground(Color.RED);
		label_6.setBounds(94, 372, 160, 14);
		contentPane.add(label_6);
	}
}
