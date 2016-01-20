package GUI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSplitPane;

public class Reset_User extends JPanel {
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public Reset_User() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u0395\u03C0\u03B5\u03BE\u03B5\u03C1\u03B3\u03B1\u03C3\u03AF\u03B1 \u03A7\u03C1\u03AE\u03C3\u03C4\u03B7");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(109, 79, 232, 20);
		add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(226, 197, 150, 21);
		add(textField);
		
		textField_1 = new JTextField();
		textField_1.setBounds(226, 135, 150, 21);
		add(textField_1);
		
		JLabel label = new JLabel("\u039F\u03BD\u03BF\u03BC\u03B1 \u03C7\u03C1\u03B7\u03C3\u03C4\u03B7 : ");
		label.setBounds(76, 135, 100, 15);
		add(label);
		
		JLabel label_1 = new JLabel("e-mail : ");
		label_1.setBounds(76, 197, 100, 15);
		add(label_1);
		
		JButton button_creset = new JButton("\u0395\u03C0\u03B1\u03BD\u03B1\u03C6\u03BF\u03C1\u03AC \u039A\u03C9\u03B4\u03B9\u03BA\u03BF\u03CD");
		button_creset.setBounds(76, 254, 131, 23);
		add(button_creset);
		
		JButton button_cancel = new JButton("\u0386\u03BA\u03C5\u03C1\u03BF");
		button_cancel.setBounds(176, 288, 89, 23);
		add(button_cancel);
		
		JButton button_delete = new JButton("\u0394\u03B9\u03B1\u03B3\u03C1\u03B1\u03C6\u03AE \u03A7\u03C1\u03AE\u03C3\u03C4\u03B7");
		button_delete.setBounds(226, 254, 150, 23);
		add(button_delete);

	}
}
