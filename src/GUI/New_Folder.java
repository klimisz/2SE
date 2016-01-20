package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class New_Folder extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public New_Folder() {
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 637, 619);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		super.setVisible(true);
		
		JLabel label = new JLabel("\u0394\u03B7\u03BC\u03B9\u03BF\u03C5\u03C1\u03B3\u03AF\u03B1 \u0399\u03B1\u03C4\u03C1\u03B9\u03BA\u03BF\u03CD \u03A6\u03B1\u03BA\u03AD\u03BB\u03BF\u03C5 \u0391\u03C3\u03B8\u03B5\u03BD\u03BF\u03CD\u03C2");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.BOLD, 16));
		label.setBounds(76, 11, 419, 20);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u038C\u03BD\u03BF\u03BC\u03B1:");
		label_1.setBounds(116, 56, 150, 15);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u0395\u03C0\u03CE\u03BD\u03C5\u03BC\u03BF:");
		label_2.setBounds(316, 56, 150, 15);
		contentPane.add(label_2);
		
		textField = new JTextField();
		textField.setBounds(116, 71, 150, 20);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setBounds(316, 71, 150, 20);
		contentPane.add(textField_1);
		
		JLabel label_3 = new JLabel("\u038C\u03BD\u03BF\u03BC\u03B1 \u03A0\u03B1\u03C4\u03C1\u03CC\u03C2:");
		label_3.setBounds(116, 102, 150, 15);
		contentPane.add(label_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(116, 117, 150, 20);
		contentPane.add(textField_2);
		
		JLabel label_4 = new JLabel("\u0397\u03BC\u03B5\u03C1\u03BF\u03BC\u03B7\u03BD\u03AF\u03B1 \u03B3\u03AD\u03BD\u03B7\u03C3\u03B7\u03C2:");
		label_4.setBounds(316, 101, 150, 15);
		contentPane.add(label_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(316, 116, 150, 20);
		contentPane.add(textField_3);
		
		JLabel label_5 = new JLabel("\u0391.\u039C.\u039A.\u0391.:");
		label_5.setBounds(116, 148, 150, 15);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("\u0391\u03C3\u03C6\u03B1\u03BB\u03B9\u03C3\u03C4\u03B9\u03BA\u03CC\u03C2 \u03A6\u03BF\u03C1\u03AD\u03B1\u03C2:");
		label_6.setBounds(316, 148, 150, 15);
		contentPane.add(label_6);
		
		textField_4 = new JTextField();
		textField_4.setBounds(116, 163, 150, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setBounds(316, 163, 150, 20);
		contentPane.add(textField_5);
		
		JLabel label_7 = new JLabel("\u03A4\u03B7\u03BB\u03AD\u03C6\u03C9\u03BD\u03BF \u039F\u03B9\u03BA\u03AF\u03B1\u03C2:");
		label_7.setBounds(116, 194, 150, 15);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("\u039A\u03B9\u03BD\u03B7\u03C4\u03CC:");
		label_8.setBounds(316, 194, 150, 15);
		contentPane.add(label_8);
		
		textField_6 = new JTextField();
		textField_6.setBounds(116, 209, 150, 20);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setBounds(316, 209, 150, 20);
		contentPane.add(textField_7);
		
		JLabel label_9 = new JLabel("\u03A0\u03CC\u03BB\u03B7 \u039A\u03B1\u03C4\u03BF\u03B9\u03BA\u03AF\u03B1\u03C2:");
		label_9.setBounds(116, 240, 150, 15);
		contentPane.add(label_9);
		
		JLabel label_10 = new JLabel("\u0394\u03B9\u03B5\u03CD\u03B8\u03C5\u03BD\u03C3\u03B7 \u039A\u03B1\u03C4\u03BF\u03B9\u03BA\u03AF\u03B1\u03C2:");
		label_10.setBounds(316, 240, 150, 15);
		contentPane.add(label_10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(116, 255, 150, 20);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setBounds(316, 255, 150, 20);
		contentPane.add(textField_9);
		
		JLabel label_11 = new JLabel("\u03A4\u039A:");
		label_11.setBounds(116, 286, 150, 15);
		contentPane.add(label_11);
		
		textField_10 = new JTextField();
		textField_10.setBounds(116, 301, 150, 20);
		contentPane.add(textField_10);
		
		JLabel label_12 = new JLabel("\u03A6\u03CD\u03BB\u03BF");
		label_12.setBounds(326, 301, 50, 15);
		contentPane.add(label_12);
		
		JRadioButton radioButton = new JRadioButton("\u0386\u03C1\u03C1\u03B5\u03BD");
		buttonGroup.add(radioButton);
		radioButton.setBounds(326, 316, 100, 25);
		contentPane.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("\u0398\u03AE\u03BB\u03C5");
		buttonGroup.add(radioButton_1);
		radioButton_1.setBounds(326, 341, 100, 25);
		contentPane.add(radioButton_1);
		
		JButton button = new JButton("\u0394\u03B7\u03BC\u03B9\u03BF\u03C5\u03C1\u03B3\u03AF\u03B1");
		button.setBounds(116, 385, 150, 25);
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int g=-1;
				if(radioButton.isSelected() && !radioButton_1.isSelected()){
					g=1;
				}
				if(!radioButton.isSelected() && radioButton_1.isSelected()){
					g=0;
				}
				Condb.importUser(textField.getText(), textField_1.getText(), textField_2.getText(), textField_3.getText(), textField_4.getText(), textField_5.getText(), Long.parseLong(textField_6.getText()), Long.parseLong(textField_7.getText()), textField_8.getText(), textField_9.getText(), Integer.parseInt(textField_10.getText()), g, 0);
				
			}
		});
		contentPane.add(button);
		
		JButton button_1 = new JButton("\u0391\u03BA\u03CD\u03C1\u03C9\u03C3\u03B7");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				
			}
		});
		button_1.setBounds(276, 385, 150, 25);
		contentPane.add(button_1);
	}

}
