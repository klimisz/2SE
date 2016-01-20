package GUI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.Font;
import javax.swing.JTabbedPane;
import javax.swing.JButton;

public class New_User extends JPanel {
	private JTextField textField_name;
	private JTextField textField_surname;
	private JTextField textField_username;
	private JTextField textField_email;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Create the panel.
	 */
	public New_User() {
		
		JLabel label = new JLabel("\u039F\u03BD\u03BF\u03BC\u03B1 : ");
		label.setBounds(69, 68, 100, 15);
		
		JLabel label_1 = new JLabel("\u0395\u03C0\u03C9\u03BD\u03C5\u03BC\u03BF : ");
		label_1.setBounds(69, 130, 100, 15);
		
		JLabel label_2 = new JLabel("\u039F\u03BD\u03BF\u03BC\u03B1 \u03C7\u03C1\u03B7\u03C3\u03C4\u03B7 : ");
		label_2.setBounds(69, 192, 100, 15);
		
		JLabel label_4 = new JLabel("e-mail : ");
		label_4.setBounds(69, 254, 100, 15);
		
		textField_name = new JTextField();
		textField_name.setBounds(219, 68, 150, 21);
		
		textField_surname = new JTextField();
		textField_surname.setBounds(219, 130, 150, 21);
		
		textField_username = new JTextField();
		textField_username.setBounds(219, 192, 150, 21);
		
		textField_email = new JTextField();
		textField_email.setBounds(219, 254, 150, 21);
		setLayout(null);
		add(label);
		add(label_1);
		add(label_2);
		add(label_4);
		add(textField_name);
		add(textField_surname);
		add(textField_username);
		add(textField_email);
		
		JLabel label_3 = new JLabel("\u0399\u03B4\u03B9\u03CC\u03C4\u03B7\u03C4\u03B1:");
		label_3.setBounds(69, 316, 46, 14);
		add(label_3);
		
		JRadioButton radioButton = new JRadioButton("\u0399\u03B1\u03C4\u03C1\u03CC\u03C2");
		buttonGroup.add(radioButton);
		radioButton.setBounds(219, 316, 109, 23);
		add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("\u039D\u03BF\u03C3\u03BF\u03C3\u03BA\u03CC\u03BC\u03BF\u03C2");
		buttonGroup.add(radioButton_1);
		radioButton_1.setBounds(219, 342, 109, 23);
		add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("\u0393\u03C1\u03B1\u03BC\u03BC\u03B1\u03C4\u03AD\u03B1\u03C2");
		buttonGroup.add(radioButton_2);
		radioButton_2.setBounds(219, 368, 109, 23);
		add(radioButton_2);
		
		JLabel lblNewLabel = new JLabel("\u0394\u03B7\u03BC\u03B9\u03BF\u03C5\u03C1\u03B3\u03AF\u03B1 \u039D\u03AD\u03BF\u03C5 \u03A7\u03C1\u03AE\u03C3\u03C4\u03B7");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(138, 11, 202, 20);
		add(lblNewLabel);
		
		JButton button_create = new JButton("\u0394\u03B7\u03BC\u03B9\u03BF\u03C5\u03C1\u03B3\u03AF\u03B1");
		button_create.setBounds(69, 461, 89, 23);
		add(button_create);
		
		JButton button_cancel = new JButton("\u0386\u03BA\u03C5\u03C1\u03BF");
		button_cancel.setBounds(168, 461, 89, 23);
		add(button_cancel);
	
	}
}
